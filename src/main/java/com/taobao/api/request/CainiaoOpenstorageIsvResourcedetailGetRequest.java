package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoOpenstorageIsvResourcedetailGetResponse;

/**
 * TOP API: cainiao.openstorage.isv.resourcedetail.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.25
 */
public class CainiaoOpenstorageIsvResourcedetailGetRequest extends BaseTaobaoRequest<CainiaoOpenstorageIsvResourcedetailGetResponse> {
	
	

	/** 
	* isv资源id
	 */
	private Long isvResourceId;

	public void setIsvResourceId(Long isvResourceId) {
		this.isvResourceId = isvResourceId;
	}

	public Long getIsvResourceId() {
		return this.isvResourceId;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.isv.resourcedetail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("isv_resource_id", this.isvResourceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageIsvResourcedetailGetResponse> getResponseClass() {
		return CainiaoOpenstorageIsvResourcedetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
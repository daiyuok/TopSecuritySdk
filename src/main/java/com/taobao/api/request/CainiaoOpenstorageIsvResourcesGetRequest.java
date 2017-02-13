package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoOpenstorageIsvResourcesGetResponse;

/**
 * TOP API: cainiao.openstorage.isv.resources.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.10
 */
public class CainiaoOpenstorageIsvResourcesGetRequest extends BaseTaobaoRequest<CainiaoOpenstorageIsvResourcesGetResponse> {
	
	

	/** 
	* isv资源类型，分为：TEMPLATE（模板）和PRINT_ITEM（打印项）
	 */
	private String isvResourceType;

	public void setIsvResourceType(String isvResourceType) {
		this.isvResourceType = isvResourceType;
	}

	public String getIsvResourceType() {
		return this.isvResourceType;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.isv.resources.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("isv_resource_type", this.isvResourceType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageIsvResourcesGetResponse> getResponseClass() {
		return CainiaoOpenstorageIsvResourcesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(isvResourceType, "isvResourceType");
	}
	

}
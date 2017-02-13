package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TopApplistGetResponse;

/**
 * TOP API: taobao.top.applist.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.20
 */
public class TopApplistGetRequest extends BaseTaobaoRequest<TopApplistGetResponse> {
	
	

	/** 
	* isv user id
	 */
	private Long isvId;

	public void setIsvId(Long isvId) {
		this.isvId = isvId;
	}

	public Long getIsvId() {
		return this.isvId;
	}

	public String getApiMethodName() {
		return "taobao.top.applist.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("isv_id", this.isvId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopApplistGetResponse> getResponseClass() {
		return TopApplistGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
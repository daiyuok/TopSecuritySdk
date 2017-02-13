package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JdsHluserGetResponse;

/**
 * TOP API: taobao.jds.hluser.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.02.25
 */
public class JdsHluserGetRequest extends BaseTaobaoRequest<JdsHluserGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.jds.hluser.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JdsHluserGetResponse> getResponseClass() {
		return JdsHluserGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
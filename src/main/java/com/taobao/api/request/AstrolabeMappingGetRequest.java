package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AstrolabeMappingGetResponse;

/**
 * TOP API: taobao.astrolabe.mapping.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.15
 */
public class AstrolabeMappingGetRequest extends BaseTaobaoRequest<AstrolabeMappingGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.astrolabe.mapping.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AstrolabeMappingGetResponse> getResponseClass() {
		return AstrolabeMappingGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
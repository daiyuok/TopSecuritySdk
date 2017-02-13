package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallBrandcatSuiteconfGetResponse;

/**
 * TOP API: tmall.brandcat.suiteconf.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.16
 */
public class TmallBrandcatSuiteconfGetRequest extends BaseTaobaoRequest<TmallBrandcatSuiteconfGetResponse> {
	
	

	public String getApiMethodName() {
		return "tmall.brandcat.suiteconf.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallBrandcatSuiteconfGetResponse> getResponseClass() {
		return TmallBrandcatSuiteconfGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCloudprintStdtemplatesGetResponse;

/**
 * TOP API: cainiao.cloudprint.stdtemplates.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.07
 */
public class CainiaoCloudprintStdtemplatesGetRequest extends BaseTaobaoRequest<CainiaoCloudprintStdtemplatesGetResponse> {
	
	

	public String getApiMethodName() {
		return "cainiao.cloudprint.stdtemplates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintStdtemplatesGetResponse> getResponseClass() {
		return CainiaoCloudprintStdtemplatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
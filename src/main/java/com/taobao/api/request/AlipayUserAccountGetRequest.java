package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayUserAccountGetResponse;

/**
 * TOP API: alipay.user.account.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayUserAccountGetRequest extends BaseTaobaoRequest<AlipayUserAccountGetResponse> {
	
	

	public String getApiMethodName() {
		return "alipay.user.account.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayUserAccountGetResponse> getResponseClass() {
		return AlipayUserAccountGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
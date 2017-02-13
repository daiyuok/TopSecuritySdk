package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayPointBudgetGetResponse;

/**
 * TOP API: alipay.point.budget.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayPointBudgetGetRequest extends BaseTaobaoRequest<AlipayPointBudgetGetResponse> {
	
	

	/** 
	* 支付宝给用户的授权。如果没有top的授权，这个字段是必填项
	 */
	private String authToken;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public String getApiMethodName() {
		return "alipay.point.budget.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_token", this.authToken);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayPointBudgetGetResponse> getResponseClass() {
		return AlipayPointBudgetGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
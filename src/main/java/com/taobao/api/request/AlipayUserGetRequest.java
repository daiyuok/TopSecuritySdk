package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayUserGetResponse;

/**
 * TOP API: alipay.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.17
 */
public class AlipayUserGetRequest extends BaseTaobaoRequest<AlipayUserGetResponse> {
	
	

	/** 
	* 支付宝给用户的授权。如果没有top的授权，这个字段是必填项
	 */
	private String authToken;

	/** 
	* 需要返回的字段列表。alipay_user_id：支付宝用户userId,user_status：支付宝用户状态,user_type：支付宝用户类型,certified：是否通过实名认证,real_name：真实姓名,logon_id：支付宝登录号,sex：用户性别
	 */
	private String fields;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "alipay.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_token", this.authToken);
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayUserGetResponse> getResponseClass() {
		return AlipayUserGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
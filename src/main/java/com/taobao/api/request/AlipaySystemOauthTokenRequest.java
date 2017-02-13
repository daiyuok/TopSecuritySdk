package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipaySystemOauthTokenResponse;

/**
 * TOP API: alipay.system.oauth.token request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipaySystemOauthTokenRequest extends BaseTaobaoRequest<AlipaySystemOauthTokenResponse> {
	
	

	/** 
	* 授权码，用户对应用授权后得到。
	 */
	private String code;

	/** 
	* 获取访问令牌的类型，authorization_code表示用授权码换，refresh_token表示用刷新令牌来换。
	 */
	private String grantType;

	/** 
	* 刷新令牌，上次换取访问令牌是得到。
	 */
	private String refreshToken;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getGrantType() {
		return this.grantType;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public String getApiMethodName() {
		return "alipay.system.oauth.token";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("code", this.code);
		txtParams.put("grant_type", this.grantType);
		txtParams.put("refresh_token", this.refreshToken);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipaySystemOauthTokenResponse> getResponseClass() {
		return AlipaySystemOauthTokenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(code, 40, "code");
		RequestCheckUtils.checkNotEmpty(grantType, "grantType");
		RequestCheckUtils.checkMaxLength(grantType, 20, "grantType");
		RequestCheckUtils.checkMaxLength(refreshToken, 40, "refreshToken");
	}
	

}
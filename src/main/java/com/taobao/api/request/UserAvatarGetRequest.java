package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.UserAvatarGetResponse;

/**
 * TOP API: taobao.user.avatar.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.23
 */
public class UserAvatarGetRequest extends BaseTaobaoRequest<UserAvatarGetResponse> {
	
	

	/** 
	* 混淆nick
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.user.avatar.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UserAvatarGetResponse> getResponseClass() {
		return UserAvatarGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}
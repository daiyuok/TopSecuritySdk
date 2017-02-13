package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpUserDeleteResponse;

/**
 * TOP API: taobao.jushita.jdp.user.delete request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.29
 */
public class JushitaJdpUserDeleteRequest extends BaseTaobaoRequest<JushitaJdpUserDeleteResponse> {
	
	

	/** 
	* 要删除用户的昵称
	 */
	private String nick;

	/** 
	* 需要删除的用户编号
	 */
	private Long userId;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.user.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpUserDeleteResponse> getResponseClass() {
		return JushitaJdpUserDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(userId, 1L, "userId");
	}
	

}
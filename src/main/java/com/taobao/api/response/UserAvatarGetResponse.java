package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.user.avatar.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UserAvatarGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4669773622492437778L;

	/** 
	 * 用户头像地址
	 */
	@ApiField("avatar")
	private String avatar;


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}
	


}

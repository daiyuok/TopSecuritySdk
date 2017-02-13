package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.User;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3193398216555454857L;

	/** 
	 * 用户信息
	 */
	@ApiField("user")
	private User user;


	public void setUser(User user) {
		this.user = user;
	}
	public User getUser( ) {
		return this.user;
	}
	


}

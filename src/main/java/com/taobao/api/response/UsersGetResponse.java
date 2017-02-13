package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.User;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.users.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UsersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6734267795446454865L;

	/** 
	 * 用户
	 */
	@ApiListField("users")
	@ApiField("user")
	private List<User> users;


	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<User> getUsers( ) {
		return this.users;
	}
	


}

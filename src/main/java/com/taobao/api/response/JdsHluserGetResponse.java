package com.taobao.api.response;

import com.taobao.api.domain.HlUserDO;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.hluser.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsHluserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3498378465412555869L;

	/** 
	 * 回流用户信息
	 */
	@ApiField("hl_user")
	private HlUserDO hlUser;


	public void setHlUser(HlUserDO hlUser) {
		this.hlUser = hlUser;
	}
	public HlUserDO getHlUser( ) {
		return this.hlUser;
	}
	


}

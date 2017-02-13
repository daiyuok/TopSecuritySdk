package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.user.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpUserAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5635576913696567839L;

	/** 
	 * 是否添加成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

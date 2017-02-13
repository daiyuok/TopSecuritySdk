package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.user.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpUserDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8167479561578877348L;

	/** 
	 * 是否删除成功
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

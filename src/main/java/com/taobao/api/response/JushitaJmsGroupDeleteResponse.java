package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jms.group.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJmsGroupDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7841717519487225385L;

	/** 
	 * 操作结果
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

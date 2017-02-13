package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8782789668965299292L;

	/** 
	 * 是否删除
	 */
	@ApiField("success")
	private Boolean success;


	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.task.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpTaskUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8587123943357792866L;

	/** 
	 * 更新任务是否成功
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

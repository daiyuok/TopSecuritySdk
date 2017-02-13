package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.storedeliver.allocation.accept response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallStoredeliverAllocationAcceptResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6165368514833621239L;

	/** 
	 * 是否执行成功
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

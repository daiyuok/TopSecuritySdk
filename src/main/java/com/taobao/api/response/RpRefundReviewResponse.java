package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.rp.refund.review response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RpRefundReviewResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5189694772755221416L;

	/** 
	 * 审核操作是否成功
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

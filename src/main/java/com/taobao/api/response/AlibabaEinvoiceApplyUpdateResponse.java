package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.apply.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceApplyUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8853925185594919466L;

	/** 
	 * 开票审核是否成功
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

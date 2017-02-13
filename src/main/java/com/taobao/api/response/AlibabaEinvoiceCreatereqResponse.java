package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.createreq response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceCreatereqResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5664682898478322499L;

	/** 
	 * 开票信息是否成功接受
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

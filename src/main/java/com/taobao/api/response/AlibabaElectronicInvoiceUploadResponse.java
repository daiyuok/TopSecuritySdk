package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.electronic.invoice.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaElectronicInvoiceUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5857373793999198793L;

	/** 
	 * 发票上传是否成功
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

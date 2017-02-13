package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.electronic.invoice.detail.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaElectronicInvoiceDetailUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1773599875421466169L;

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

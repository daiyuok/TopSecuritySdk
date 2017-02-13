package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.serialno.generate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceSerialnoGenerateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7895556266594352812L;

	/** 
	 * result
	 */
	@ApiField("serial_no")
	private String serialNo;


	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}
	


}

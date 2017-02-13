package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ElectronicInvoiceDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.electronic.invoice.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaElectronicInvoiceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1592622843155456932L;

	/** 
	 * 电子发票详细信息
	 */
	@ApiField("invoice_detail")
	private ElectronicInvoiceDetail invoiceDetail;


	public void setInvoiceDetail(ElectronicInvoiceDetail invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}
	public ElectronicInvoiceDetail getInvoiceDetail( ) {
		return this.invoiceDetail;
	}
	


}

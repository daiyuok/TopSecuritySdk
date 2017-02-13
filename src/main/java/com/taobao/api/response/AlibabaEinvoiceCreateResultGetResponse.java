package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.InvoiceResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.create.result.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceCreateResultGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5592226841252176741L;

	/** 
	 * 开票返回结果数据列表
	 */
	@ApiListField("invoice_result_list")
	@ApiField("invoice_result")
	private List<InvoiceResult> invoiceResultList;


	public void setInvoiceResultList(List<InvoiceResult> invoiceResultList) {
		this.invoiceResultList = invoiceResultList;
	}
	public List<InvoiceResult> getInvoiceResultList( ) {
		return this.invoiceResultList;
	}
	


}

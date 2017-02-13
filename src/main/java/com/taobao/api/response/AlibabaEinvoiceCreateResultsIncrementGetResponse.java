package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.InvoiceResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.create.results.increment.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceCreateResultsIncrementGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7244676485114837749L;

	/** 
	 * 开票结果返回列表
	 */
	@ApiListField("invoice_result_list")
	@ApiField("invoice_result")
	private List<InvoiceResult> invoiceResultList;

	/** 
	 * 符合条件的开票总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setInvoiceResultList(List<InvoiceResult> invoiceResultList) {
		this.invoiceResultList = invoiceResultList;
	}
	public List<InvoiceResult> getInvoiceResultList( ) {
		return this.invoiceResultList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}

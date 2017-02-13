package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TopAcctCashJourDto;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tae.book.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TaeBookBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5413428871924432265L;

	/** 
	 * 虚拟账户账单
	 */
	@ApiField("bookbill")
	private TopAcctCashJourDto bookbill;


	public void setBookbill(TopAcctCashJourDto bookbill) {
		this.bookbill = bookbill;
	}
	public TopAcctCashJourDto getBookbill( ) {
		return this.bookbill;
	}
	


}

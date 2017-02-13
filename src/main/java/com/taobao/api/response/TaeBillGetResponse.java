package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.BillDto;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tae.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TaeBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6768869373193643929L;

	/** 
	 * 账单明细
	 */
	@ApiField("bill")
	private BillDto bill;


	public void setBill(BillDto bill) {
		this.bill = bill;
	}
	public BillDto getBill( ) {
		return this.bill;
	}
	


}

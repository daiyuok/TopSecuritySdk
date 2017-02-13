package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.electronic.invoice.prepare response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaElectronicInvoicePrepareResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1762591831256797511L;

	/** 
	 * 建议开票金额。为交易金额扣除积分这类可不开票金额后的金额。目前只有确认收货后才会返回此值。
	 */
	@ApiField("suggested_amount")
	private String suggestedAmount;


	public void setSuggestedAmount(String suggestedAmount) {
		this.suggestedAmount = suggestedAmount;
	}
	public String getSuggestedAmount( ) {
		return this.suggestedAmount;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.order.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOrderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5337177698236971377L;

	/** 
	 * 淘宝物流订单交易号，如返回-1则表示错误。如果在新建订单时传入trade_id,此处会返回此id，如果未传入trade_id，此处会返回淘宝物流分配的交易号码。
	 */
	@ApiField("trade_id")
	private Long tradeId;


	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}
	public Long getTradeId( ) {
		return this.tradeId;
	}
	


}

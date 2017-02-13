package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.memo.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeMemoAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7692692565347829612L;

	/** 
	 * 对一笔交易添加备注后返回其对应的Trade，Trade中可用的返回字段有tid和created
	 */
	@ApiField("trade")
	private Trade trade;


	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}
	


}

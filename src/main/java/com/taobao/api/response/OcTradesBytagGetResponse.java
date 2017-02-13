package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.oc.trades.bytag.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcTradesBytagGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8722191993664191671L;

	/** 
	 * 打了该标签的订单编号列表
	 */
	@ApiListField("tids")
	@ApiField("number")
	private List<Long> tids;

	/** 
	 * 总数
	 */
	@ApiField("totals")
	private Long totals;


	public void setTids(List<Long> tids) {
		this.tids = tids;
	}
	public List<Long> getTids( ) {
		return this.tids;
	}

	public void setTotals(Long totals) {
		this.totals = totals;
	}
	public Long getTotals( ) {
		return this.totals;
	}
	


}

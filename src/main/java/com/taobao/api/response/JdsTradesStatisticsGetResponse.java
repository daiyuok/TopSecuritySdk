package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeStat;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.trades.statistics.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsTradesStatisticsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6551836675512195656L;

	/** 
	 * 订单状态计数值
	 */
	@ApiListField("status_infos")
	@ApiField("trade_stat")
	private List<TradeStat> statusInfos;


	public void setStatusInfos(List<TradeStat> statusInfos) {
		this.statusInfos = statusInfos;
	}
	public List<TradeStat> getStatusInfos( ) {
		return this.statusInfos;
	}
	


}

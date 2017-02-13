package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeTrace;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.trade.traces.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsTradeTracesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3598432721412456642L;

	/** 
	 * 跟踪信息列表
	 */
	@ApiListField("traces")
	@ApiField("trade_trace")
	private List<TradeTrace> traces;

	/** 
	 * 在订单全链路系统中的状态(比如是否存在)
	 */
	@ApiField("user_status")
	private String userStatus;


	public void setTraces(List<TradeTrace> traces) {
		this.traces = traces;
	}
	public List<TradeTrace> getTraces( ) {
		return this.traces;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}
	


}

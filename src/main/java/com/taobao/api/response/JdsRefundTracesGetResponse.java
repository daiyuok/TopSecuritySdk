package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RefundTrace;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.refund.traces.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsRefundTracesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6883183522572994628L;

	/** 
	 * 退款跟踪列表
	 */
	@ApiListField("traces")
	@ApiField("refund_trace")
	private List<RefundTrace> traces;

	/** 
	 * 用户在全链路系统中的状态(比如是否存在)
	 */
	@ApiField("user_status")
	private String userStatus;


	public void setTraces(List<RefundTrace> traces) {
		this.traces = traces;
	}
	public List<RefundTrace> getTraces( ) {
		return this.traces;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}
	


}

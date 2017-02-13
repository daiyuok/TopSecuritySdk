package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.ebpp.bill.key.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayEbppBillKeySearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4144187996427543434L;

	/** 
	 * 请求受理ID。
	 */
	@ApiField("task_id")
	private String taskId;


	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}
	


}

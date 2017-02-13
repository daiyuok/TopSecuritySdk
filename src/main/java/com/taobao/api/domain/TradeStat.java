package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单全链路中的订单状态统计
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeStat extends TaobaoObject {

	private static final long serialVersionUID = 4668391349445528849L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 状态名称
	 */
	@ApiField("status")
	private String status;


	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

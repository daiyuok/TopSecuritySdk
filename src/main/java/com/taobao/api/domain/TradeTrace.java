package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 交易回流信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeTrace extends TaobaoObject {

	private static final long serialVersionUID = 6487462278158958538L;

	/**
	 * 动作发生的时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 应用标题
	 */
	@ApiField("app_title")
	private String appTitle;

	/**
	 * 子订单的id列表,以逗号分割
	 */
	@ApiField("order_ids")
	private String orderIds;

	/**
	 * 备注字段
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 卖家的淘宝nick
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 回流的订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易tid
	 */
	@ApiField("tid")
	private Long tid;


	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getAppTitle() {
		return this.appTitle;
	}
	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	public String getOrderIds() {
		return this.orderIds;
	}
	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}

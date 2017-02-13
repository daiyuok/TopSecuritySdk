package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoReturnBillOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 6442138557569884489L;

	/**
	 * 订单商品信息
	 */
	@ApiField("order_item")
	private CainiaoReturnBillOrderitem orderItem;


	public CainiaoReturnBillOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoReturnBillOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}

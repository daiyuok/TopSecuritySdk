package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AddressPair extends TaobaoObject {

	private static final long serialVersionUID = 5769473282924397798L;

	/**
	 * 收货地址
	 */
	@ApiField("consignee_address")
	private WaybillAddress consigneeAddress;

	/**
	 * 发货地址
	 */
	@ApiField("shipping_address")
	private WaybillAddress shippingAddress;

	/**
	 * 电商平台交易单号
	 */
	@ApiField("trade_order_code")
	private String tradeOrderCode;

	/**
	 * 运单号或面单号
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public WaybillAddress getConsigneeAddress() {
		return this.consigneeAddress;
	}
	public void setConsigneeAddress(WaybillAddress consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public WaybillAddress getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(WaybillAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getTradeOrderCode() {
		return this.tradeOrderCode;
	}
	public void setTradeOrderCode(String tradeOrderCode) {
		this.tradeOrderCode = tradeOrderCode;
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}
	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}

}

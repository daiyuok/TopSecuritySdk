package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.stock.in.order.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockInOrderNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7484174994869797462L;

	/** 
	 * 仓储订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误详细
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	


}

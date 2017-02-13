package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ShipFresh;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.order.shengxian.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOrderShengxianConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3117656344421321941L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 发货成功后，返回承运商的信息
	 */
	@ApiField("ship_fresh")
	private ShipFresh shipFresh;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setShipFresh(ShipFresh shipFresh) {
		this.shipFresh = shipFresh;
	}
	public ShipFresh getShipFresh( ) {
		return this.shipFresh;
	}
	


}

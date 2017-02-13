package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WmsOrderWarehouseRouteGetResponse;

/**
 * TOP API: taobao.wms.order.warehouse.route.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.14
 */
public class WmsOrderWarehouseRouteGetRequest extends BaseTaobaoRequest<WmsOrderWarehouseRouteGetResponse> {
	
	

	/** 
	* 订单编号
	 */
	private String orderCode;

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public String getApiMethodName() {
		return "taobao.wms.order.warehouse.route.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_code", this.orderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WmsOrderWarehouseRouteGetResponse> getResponseClass() {
		return WmsOrderWarehouseRouteGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
	}
	

}
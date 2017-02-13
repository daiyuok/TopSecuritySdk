package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.QimenOrderstatusUpdateResponse;

/**
 * TOP API: taobao.qimen.orderstatus.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.25
 */
public class QimenOrderstatusUpdateRequest extends BaseTaobaoRequest<QimenOrderstatusUpdateResponse> {
	
	

	/** 
	* 事件发生时间
	 */
	private String actionTime;

	/** 
	* 星盘派单号
	 */
	private String allocationCode;

	/** 
	* 操作人
	 */
	private String operator;

	/** 
	* 淘系子订单号
	 */
	private String orderCodes;

	/** 
	* 订单状态，门店发货包括X_SHOP_ALLOCATION、X_SHOP_DENYX_SHOP_HANDLED、X_SHOP_CANCEL_CONFIRM、X_SHOP_CANCEL_DENIED、X_MATCHED；门店自提包括X_COMMODITY_CONFIRMX_COMMODITY_TRANSER、X_TRANSFER _SUCCESS、X_SHOP_CANCEL_CONFIRM、X_MATCHED、X_SHOP_DENY
	 */
	private String status;

	/** 
	* 目标门店的商户中心门店编码
	 */
	private Long storeId;

	/** 
	* 业务类型，（枚举值：FAHUO、ZITI）
	 */
	private String type;

	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionTime() {
		return this.actionTime;
	}

	public void setAllocationCode(String allocationCode) {
		this.allocationCode = allocationCode;
	}

	public String getAllocationCode() {
		return this.allocationCode;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOrderCodes(String orderCodes) {
		this.orderCodes = orderCodes;
	}

	public String getOrderCodes() {
		return this.orderCodes;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.qimen.orderstatus.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action_time", this.actionTime);
		txtParams.put("allocation_code", this.allocationCode);
		txtParams.put("operator", this.operator);
		txtParams.put("order_codes", this.orderCodes);
		txtParams.put("status", this.status);
		txtParams.put("store_id", this.storeId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenOrderstatusUpdateResponse> getResponseClass() {
		return QimenOrderstatusUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(allocationCode, "allocationCode");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(orderCodes, "orderCodes");
		RequestCheckUtils.checkMaxListSize(orderCodes, 20, "orderCodes");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(storeId, "storeId");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}
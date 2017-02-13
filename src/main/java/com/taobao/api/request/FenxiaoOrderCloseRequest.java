package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoOrderCloseResponse;

/**
 * TOP API: taobao.fenxiao.order.close request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoOrderCloseRequest extends BaseTaobaoRequest<FenxiaoOrderCloseResponse> {
	
	

	/** 
	* 关闭理由,特殊字符会被转义，会改变长度，有特殊字符是请注意
	 */
	private String message;

	/** 
	* 采购单编号
	 */
	private Long purchaseOrderId;

	/** 
	* 子采购单ID，可传多笔子单ID，逗号分隔
	 */
	private String subOrderIds;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setSubOrderIds(String subOrderIds) {
		this.subOrderIds = subOrderIds;
	}

	public String getSubOrderIds() {
		return this.subOrderIds;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.order.close";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		txtParams.put("sub_order_ids", this.subOrderIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoOrderCloseResponse> getResponseClass() {
		return FenxiaoOrderCloseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(message, "message");
		RequestCheckUtils.checkMaxLength(message, 200, "message");
		RequestCheckUtils.checkNotEmpty(purchaseOrderId, "purchaseOrderId");
	}
	

}
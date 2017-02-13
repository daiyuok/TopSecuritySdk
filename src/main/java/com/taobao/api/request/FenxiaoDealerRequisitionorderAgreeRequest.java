package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDealerRequisitionorderAgreeResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.agree request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoDealerRequisitionorderAgreeRequest extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderAgreeResponse> {
	
	

	/** 
	* 采购申请/经销采购单编号
	 */
	private Long dealerOrderId;

	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}

	public Long getDealerOrderId() {
		return this.dealerOrderId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.dealer.requisitionorder.agree";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dealer_order_id", this.dealerOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDealerRequisitionorderAgreeResponse> getResponseClass() {
		return FenxiaoDealerRequisitionorderAgreeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
	}
	

}
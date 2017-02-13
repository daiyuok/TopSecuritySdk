package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RpReturngoodsRefillResponse;

/**
 * TOP API: taobao.rp.returngoods.refill request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.10
 */
public class RpReturngoodsRefillRequest extends BaseTaobaoRequest<RpReturngoodsRefillResponse> {
	
	

	/** 
	* 物流公司编号
	 */
	private String logisticsCompanyCode;

	/** 
	* 物流公司运单号
	 */
	private String logisticsWaybillNo;

	/** 
	* 退款单编号
	 */
	private Long refundId;

	/** 
	* 退款阶段，可选值：售中：onsale，售后：aftersale
	 */
	private String refundPhase;

	public void setLogisticsCompanyCode(String logisticsCompanyCode) {
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	public String getLogisticsCompanyCode() {
		return this.logisticsCompanyCode;
	}

	public void setLogisticsWaybillNo(String logisticsWaybillNo) {
		this.logisticsWaybillNo = logisticsWaybillNo;
	}

	public String getLogisticsWaybillNo() {
		return this.logisticsWaybillNo;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundPhase(String refundPhase) {
		this.refundPhase = refundPhase;
	}

	public String getRefundPhase() {
		return this.refundPhase;
	}

	public String getApiMethodName() {
		return "taobao.rp.returngoods.refill";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("logistics_company_code", this.logisticsCompanyCode);
		txtParams.put("logistics_waybill_no", this.logisticsWaybillNo);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RpReturngoodsRefillResponse> getResponseClass() {
		return RpReturngoodsRefillResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(logisticsCompanyCode, "logisticsCompanyCode");
		RequestCheckUtils.checkNotEmpty(logisticsWaybillNo, "logisticsWaybillNo");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refundPhase, "refundPhase");
	}
	

}
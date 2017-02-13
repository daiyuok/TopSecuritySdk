package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RpRefundReviewResponse;

/**
 * TOP API: taobao.rp.refund.review request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.10
 */
public class RpRefundReviewRequest extends BaseTaobaoRequest<RpRefundReviewResponse> {
	
	

	/** 
	* 审核留言
	 */
	private String message;

	/** 
	* 审核人姓名
	 */
	private String operator;

	/** 
	* 退款单编号
	 */
	private Long refundId;

	/** 
	* 退款阶段，可选值：售中：onsale，售后：aftersale
	 */
	private String refundPhase;

	/** 
	* 退款最后更新时间，以时间戳的方式表示
	 */
	private Long refundVersion;

	/** 
	* 审核是否可用于批量退款，可选值：true（审核通过），false（审核不通过或反审核）
	 */
	private Boolean result;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
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

	public void setRefundVersion(Long refundVersion) {
		this.refundVersion = refundVersion;
	}

	public Long getRefundVersion() {
		return this.refundVersion;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getResult() {
		return this.result;
	}

	public String getApiMethodName() {
		return "taobao.rp.refund.review";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("operator", this.operator);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		txtParams.put("refund_version", this.refundVersion);
		txtParams.put("result", this.result);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RpRefundReviewResponse> getResponseClass() {
		return RpRefundReviewResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(message, "message");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refundPhase, "refundPhase");
		RequestCheckUtils.checkNotEmpty(refundVersion, "refundVersion");
		RequestCheckUtils.checkNotEmpty(result, "result");
	}
	

}
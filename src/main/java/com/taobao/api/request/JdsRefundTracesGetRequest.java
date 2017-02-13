package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JdsRefundTracesGetResponse;

/**
 * TOP API: taobao.jds.refund.traces.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.02.25
 */
public class JdsRefundTracesGetRequest extends BaseTaobaoRequest<JdsRefundTracesGetResponse> {
	
	

	/** 
	* 淘宝的退款编号
	 */
	private Long refundId;

	/** 
	* 是否返回用户状态(是否存在)
	 */
	private Boolean returnUserStatus;

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setReturnUserStatus(Boolean returnUserStatus) {
		this.returnUserStatus = returnUserStatus;
	}

	public Boolean getReturnUserStatus() {
		return this.returnUserStatus;
	}

	public String getApiMethodName() {
		return "taobao.jds.refund.traces.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		txtParams.put("return_user_status", this.returnUserStatus);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JdsRefundTracesGetResponse> getResponseClass() {
		return JdsRefundTracesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
	}
	

}
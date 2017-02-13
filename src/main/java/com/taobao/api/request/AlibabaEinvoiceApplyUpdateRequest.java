package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceApplyUpdateResponse;

/**
 * TOP API: alibaba.einvoice.apply.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.23
 */
public class AlibabaEinvoiceApplyUpdateRequest extends BaseTaobaoRequest<AlibabaEinvoiceApplyUpdateResponse> {
	
	

	/** 
	* 开票申请ID
	 */
	private String applyId;

	/** 
	* 订单所属平台
	 */
	private String platformCode;

	/** 
	* 订单号
	 */
	private String platformTid;

	/** 
	* 拒绝申请的原因
	 */
	private String reason;

	/** 
	* 审核结果，0-拒绝，2-同意
	 */
	private Long status;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyId() {
		return this.applyId;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.apply.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("apply_id", this.applyId);
		txtParams.put("platform_code", this.platformCode);
		txtParams.put("platform_tid", this.platformTid);
		txtParams.put("reason", this.reason);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceApplyUpdateResponse> getResponseClass() {
		return AlibabaEinvoiceApplyUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(applyId, "applyId");
		RequestCheckUtils.checkNotEmpty(platformCode, "platformCode");
		RequestCheckUtils.checkNotEmpty(platformTid, "platformTid");
		RequestCheckUtils.checkNotEmpty(status, "status");
	}
	

}
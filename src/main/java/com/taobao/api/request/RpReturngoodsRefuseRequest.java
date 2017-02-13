package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RpReturngoodsRefuseResponse;

/**
 * TOP API: taobao.rp.returngoods.refuse request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.19
 */
public class RpReturngoodsRefuseRequest extends BaseTaobaoRequest<RpReturngoodsRefuseResponse> implements TaobaoUploadRequest<RpReturngoodsRefuseResponse> {

	
	

	/** 
	* 退款编号
	 */
	private Long refundId;

	/** 
	* 退款服务状态，售后或者售中
	 */
	private String refundPhase;

	/** 
	* 退款版本号
	 */
	private Long refundVersion;

	/** 
	* 拒绝退货凭证图片，必须图片格式，大小不能超过5M
	 */
	private FileItem refuseProof;

	/** 
	* 拒绝原因编号，会提供拒绝原因列表供选择
	 */
	private Long refuseReasonId;

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

	public void setRefuseProof(FileItem refuseProof) {
		this.refuseProof = refuseProof;
	}

	public FileItem getRefuseProof() {
		return this.refuseProof;
	}

	public void setRefuseReasonId(Long refuseReasonId) {
		this.refuseReasonId = refuseReasonId;
	}

	public Long getRefuseReasonId() {
		return this.refuseReasonId;
	}

	public String getApiMethodName() {
		return "taobao.rp.returngoods.refuse";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		txtParams.put("refund_version", this.refundVersion);
		txtParams.put("refuse_reason_id", this.refuseReasonId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RpReturngoodsRefuseResponse> getResponseClass() {
		return RpReturngoodsRefuseResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refundPhase, "refundPhase");
		RequestCheckUtils.checkNotEmpty(refundVersion, "refundVersion");
		RequestCheckUtils.checkNotEmpty(refuseProof, "refuseProof");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("refuse_proof", this.refuseProof);
		return params;
	}
	
	

}
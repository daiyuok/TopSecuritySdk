package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.apply.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceApplyGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8253629382926625475L;

	/** 
	 * 查询结果
	 */
	@ApiField("einvoice_apply")
	private EinvoiceApplyDo einvoiceApply;

	/** 
	 * success
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setEinvoiceApply(EinvoiceApplyDo einvoiceApply) {
		this.einvoiceApply = einvoiceApply;
	}
	public EinvoiceApplyDo getEinvoiceApply( ) {
		return this.einvoiceApply;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	
	/**
 * 查询结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class EinvoiceApplyDo extends TaobaoObject {

	private static final long serialVersionUID = 4183256369168197863L;

	/**
		 * 开票申请ID
		 */
		@ApiField("apply_id")
		private String applyId;
		/**
		 * 买家备注
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 订单所属平台
		 */
		@ApiField("platform_code")
		private String platformCode;
		/**
		 * 订单号
		 */
		@ApiField("platform_tid")
		private String platformTid;
		/**
		 * 拒绝申请原因
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 申请状态，0-拒绝，1-申请中，2-同意
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	

	public String getApplyId() {
			return this.applyId;
		}
		public void setApplyId(String applyId) {
			this.applyId = applyId;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getPlatformCode() {
			return this.platformCode;
		}
		public void setPlatformCode(String platformCode) {
			this.platformCode = platformCode;
		}
		public String getPlatformTid() {
			return this.platformTid;
		}
		public void setPlatformTid(String platformTid) {
			this.platformTid = platformTid;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}

}



}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybillprint.clientupdate.getconfig response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillprintClientupdateGetconfigResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5547747652495897375L;

	/** 
	 * result
	 */
	@ApiField("result")
	private UpdateConfigTopResult result;


	public void setResult(UpdateConfigTopResult result) {
		this.result = result;
	}
	public UpdateConfigTopResult getResult( ) {
		return this.result;
	}
	
	/**
 * update
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateConfigActInfo extends TaobaoObject {

	private static final long serialVersionUID = 7693927746884999328L;

	/**
		 * url
		 */
		@ApiField("url")
		private String url;
		/**
		 * version
		 */
		@ApiField("version")
		private String version;
	

	public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}

}

	/**
 * notice
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateConfigMsgInfo extends TaobaoObject {

	private static final long serialVersionUID = 2897797144393454495L;

	/**
		 * msg
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * msgid
		 */
		@ApiField("msgid")
		private Long msgid;
	

	public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Long getMsgid() {
			return this.msgid;
		}
		public void setMsgid(Long msgid) {
			this.msgid = msgid;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateConfigTopResult extends TaobaoObject {

	private static final long serialVersionUID = 8519115253452212332L;

	/**
		 * actDescription
		 */
		@ApiField("act_description")
		private String actDescription;
		/**
		 * actStatus
		 */
		@ApiField("act_status")
		private Long actStatus;
		/**
		 * description
		 */
		@ApiField("description")
		private String description;
		/**
		 * enforceUpdate
		 */
		@ApiField("enforce_update")
		private UpdateConfigActInfo enforceUpdate;
		/**
		 * grayCtrl
		 */
		@ApiField("gray_ctrl")
		private UpdateConfigActInfo grayCtrl;
		/**
		 * msgDescription
		 */
		@ApiField("msg_description")
		private String msgDescription;
		/**
		 * msgStatus
		 */
		@ApiField("msg_status")
		private Long msgStatus;
		/**
		 * notice
		 */
		@ApiField("notice")
		private UpdateConfigMsgInfo notice;
		/**
		 * noticeFlag
		 */
		@ApiField("notice_flag")
		private Boolean noticeFlag;
		/**
		 * rollback
		 */
		@ApiField("rollback")
		private UpdateConfigActInfo rollback;
		/**
		 * status
		 */
		@ApiField("status")
		private Long status;
		/**
		 * step
		 */
		@ApiField("step")
		private Long step;
		/**
		 * update
		 */
		@ApiField("update")
		private UpdateConfigActInfo update;
		/**
		 * updateType
		 */
		@ApiField("update_type")
		private String updateType;
	

	public String getActDescription() {
			return this.actDescription;
		}
		public void setActDescription(String actDescription) {
			this.actDescription = actDescription;
		}
		public Long getActStatus() {
			return this.actStatus;
		}
		public void setActStatus(Long actStatus) {
			this.actStatus = actStatus;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public UpdateConfigActInfo getEnforceUpdate() {
			return this.enforceUpdate;
		}
		public void setEnforceUpdate(UpdateConfigActInfo enforceUpdate) {
			this.enforceUpdate = enforceUpdate;
		}
		public UpdateConfigActInfo getGrayCtrl() {
			return this.grayCtrl;
		}
		public void setGrayCtrl(UpdateConfigActInfo grayCtrl) {
			this.grayCtrl = grayCtrl;
		}
		public String getMsgDescription() {
			return this.msgDescription;
		}
		public void setMsgDescription(String msgDescription) {
			this.msgDescription = msgDescription;
		}
		public Long getMsgStatus() {
			return this.msgStatus;
		}
		public void setMsgStatus(Long msgStatus) {
			this.msgStatus = msgStatus;
		}
		public UpdateConfigMsgInfo getNotice() {
			return this.notice;
		}
		public void setNotice(UpdateConfigMsgInfo notice) {
			this.notice = notice;
		}
		public Boolean getNoticeFlag() {
			return this.noticeFlag;
		}
		public void setNoticeFlag(Boolean noticeFlag) {
			this.noticeFlag = noticeFlag;
		}
		public UpdateConfigActInfo getRollback() {
			return this.rollback;
		}
		public void setRollback(UpdateConfigActInfo rollback) {
			this.rollback = rollback;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getStep() {
			return this.step;
		}
		public void setStep(Long step) {
			this.step = step;
		}
		public UpdateConfigActInfo getUpdate() {
			return this.update;
		}
		public void setUpdate(UpdateConfigActInfo update) {
			this.update = update;
		}
		public String getUpdateType() {
			return this.updateType;
		}
		public void setUpdateType(String updateType) {
			this.updateType = updateType;
		}

}



}

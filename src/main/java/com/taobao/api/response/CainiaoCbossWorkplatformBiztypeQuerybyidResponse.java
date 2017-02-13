package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.biztype.querybyid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformBiztypeQuerybyidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4498835452717819148L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 8386589529617712332L;

	/**
		 * bizTypeJson
		 */
		@ApiField("biz_type_json")
		private String bizTypeJson;
		/**
		 * errorCode
		 */
		@ApiField("res_error_code")
		private String resErrorCode;
		/**
		 * errorMsg
		 */
		@ApiField("res_error_msg")
		private String resErrorMsg;
		/**
		 * success
		 */
		@ApiField("res_success")
		private Boolean resSuccess;
	

	public String getBizTypeJson() {
			return this.bizTypeJson;
		}
		public void setBizTypeJson(String bizTypeJson) {
			this.bizTypeJson = bizTypeJson;
		}
		public String getResErrorCode() {
			return this.resErrorCode;
		}
		public void setResErrorCode(String resErrorCode) {
			this.resErrorCode = resErrorCode;
		}
		public String getResErrorMsg() {
			return this.resErrorMsg;
		}
		public void setResErrorMsg(String resErrorMsg) {
			this.resErrorMsg = resErrorMsg;
		}
		public Boolean getResSuccess() {
			return this.resSuccess;
		}
		public void setResSuccess(Boolean resSuccess) {
			this.resSuccess = resSuccess;
		}

}



}

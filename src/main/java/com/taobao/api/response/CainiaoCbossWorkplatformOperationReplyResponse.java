package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.operation.reply response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformOperationReplyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5881687498762235723L;

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

	private static final long serialVersionUID = 2197794183498627884L;

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

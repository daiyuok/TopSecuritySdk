package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.workorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformWorkorderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7726222339515698472L;

	/** 
	 * 接口返回model
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
 * 接口返回model
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 8164685292739246845L;

	/**
		 * 错误码
		 */
		@ApiField("res_error_code")
		private String resErrorCode;
		/**
		 * 错误信息
		 */
		@ApiField("res_error_msg")
		private String resErrorMsg;
		/**
		 * 是否成功
		 */
		@ApiField("res_success")
		private Boolean resSuccess;
		/**
		 * workOrderId
		 */
		@ApiField("work_order_id")
		private String workOrderId;
	

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
		public String getWorkOrderId() {
			return this.workOrderId;
		}
		public void setWorkOrderId(String workOrderId) {
			this.workOrderId = workOrderId;
		}

}



}

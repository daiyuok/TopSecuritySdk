package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.unknown.package.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsUnknownPackageUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6731136956473315168L;

	/** 
	 * WlbWmsUnknownPackageUploadResp
	 */
	@ApiField("response")
	private WlbWmsUnknownPackageUploadResp response;


	public void setResponse(WlbWmsUnknownPackageUploadResp response) {
		this.response = response;
	}
	public WlbWmsUnknownPackageUploadResp getResponse( ) {
		return this.response;
	}
	
	/**
 * WlbWmsUnknownPackageUploadResp
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WlbWmsUnknownPackageUploadResp extends TaobaoObject {

	private static final long serialVersionUID = 3425996118379854856L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private String success;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getSuccess() {
			return this.success;
		}
		public void setSuccess(String success) {
			this.success = success;
		}

}



}

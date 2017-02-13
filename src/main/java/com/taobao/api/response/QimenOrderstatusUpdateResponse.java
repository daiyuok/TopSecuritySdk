package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.orderstatus.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenOrderstatusUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8793811228578398115L;

	/** 
	 * success
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * message
	 */
	@ApiField("message")
	private String message;

	/** 
	 * resultCode
	 */
	@ApiField("result_code")
	private String resultCode;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}
	


}

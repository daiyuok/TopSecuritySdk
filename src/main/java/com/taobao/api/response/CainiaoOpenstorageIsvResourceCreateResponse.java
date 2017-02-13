package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.isv.resource.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageIsvResourceCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6147969747321855261L;

	/** 
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误消息
	 */
	@ApiField("err_message")
	private String errMessage;


	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getErrMessage( ) {
		return this.errMessage;
	}
	


}

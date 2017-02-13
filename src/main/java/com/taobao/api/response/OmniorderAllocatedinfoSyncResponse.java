package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.omniorder.allocatedinfo.sync response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OmniorderAllocatedinfoSyncResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2338329696828645497L;

	/** 
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误内容
	 */
	@ApiField("message")
	private String message;


	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}
	


}

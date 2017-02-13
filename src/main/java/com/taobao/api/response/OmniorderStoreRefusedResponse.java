package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.omniorder.store.refused response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OmniorderStoreRefusedResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7817148724172544934L;

	/** 
	 * 正常为0,其他表示异常
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * message
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

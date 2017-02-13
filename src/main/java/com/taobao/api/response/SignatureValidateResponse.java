package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.signature.validate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SignatureValidateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2558615799269783841L;

	/** 
	 * appkey拥有者ID
	 */
	@ApiField("isv_id")
	private Long isvId;

	/** 
	 * 签名是否有效
	 */
	@ApiField("valid")
	private Boolean valid;


	public void setIsvId(Long isvId) {
		this.isvId = isvId;
	}
	public Long getIsvId( ) {
		return this.isvId;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}
	


}

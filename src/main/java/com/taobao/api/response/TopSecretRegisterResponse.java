package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.secret.register response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopSecretRegisterResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2357466259865946933L;

	/** 
	 * 返回操作是否成功
	 */
	@ApiField("result")
	private Boolean result;


	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}

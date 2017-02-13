package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.hluser.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsHluserUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4683761417735186115L;

	/** 
	 * 是否成功
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

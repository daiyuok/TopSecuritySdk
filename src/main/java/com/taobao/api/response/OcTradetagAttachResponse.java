package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.oc.tradetag.attach response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcTradetagAttachResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6333562479963541643L;

	/** 
	 * 操作成功或者操作失败
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

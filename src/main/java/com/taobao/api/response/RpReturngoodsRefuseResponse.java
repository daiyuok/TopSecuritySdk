package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.rp.returngoods.refuse response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RpReturngoodsRefuseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3396616514341466434L;

	/** 
	 * asdf
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

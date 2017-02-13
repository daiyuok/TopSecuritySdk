package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.outerid.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemOuteridUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1169286958199572965L;

	/** 
	 * 商家编码更新结果
	 */
	@ApiField("outerid_update_result")
	private String outeridUpdateResult;


	public void setOuteridUpdateResult(String outeridUpdateResult) {
		this.outeridUpdateResult = outeridUpdateResult;
	}
	public String getOuteridUpdateResult( ) {
		return this.outeridUpdateResult;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.order.message.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoOrderMessageAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3611475568549828488L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

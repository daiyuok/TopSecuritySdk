package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6325185466465844293L;

	/** 
	 * 调用取消是否成功
	 */
	@ApiField("cancel_result")
	private Boolean cancelResult;


	public void setCancelResult(Boolean cancelResult) {
		this.cancelResult = cancelResult;
	}
	public Boolean getCancelResult( ) {
		return this.cancelResult;
	}
	


}

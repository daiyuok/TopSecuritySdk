package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbWmsOrderStatusUploadResp;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.order.status.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsOrderStatusUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1491874566713312527L;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private WlbWmsOrderStatusUploadResp result;


	public void setResult(WlbWmsOrderStatusUploadResp result) {
		this.result = result;
	}
	public WlbWmsOrderStatusUploadResp getResult( ) {
		return this.result;
	}
	


}

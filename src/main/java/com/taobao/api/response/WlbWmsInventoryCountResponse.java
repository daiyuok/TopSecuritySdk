package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbWmsInventoryCountResp;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3139372186258486133L;

	/** 
	 * result
	 */
	@ApiField("result")
	private WlbWmsInventoryCountResp result;


	public void setResult(WlbWmsInventoryCountResp result) {
		this.result = result;
	}
	public WlbWmsInventoryCountResp getResult( ) {
		return this.result;
	}
	


}

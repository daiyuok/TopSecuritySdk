package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WaybillDistributeInfoResponse;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.distributeinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIDistributeinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4219211355787328414L;

	/** 
	 * 查询分拣信息的返回结果
	 */
	@ApiField("waybill_distribute_info_response")
	private WaybillDistributeInfoResponse waybillDistributeInfoResponse;


	public void setWaybillDistributeInfoResponse(WaybillDistributeInfoResponse waybillDistributeInfoResponse) {
		this.waybillDistributeInfoResponse = waybillDistributeInfoResponse;
	}
	public WaybillDistributeInfoResponse getWaybillDistributeInfoResponse( ) {
		return this.waybillDistributeInfoResponse;
	}
	


}

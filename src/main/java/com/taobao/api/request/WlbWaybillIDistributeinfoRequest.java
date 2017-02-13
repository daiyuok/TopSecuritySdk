package com.taobao.api.request;

import com.taobao.api.domain.WaybillDistributeInfoRequest;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIDistributeinfoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.distributeinfo request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.17
 */
public class WlbWaybillIDistributeinfoRequest extends BaseTaobaoRequest<WlbWaybillIDistributeinfoResponse> {
	
	

	/** 
	* 查询分拣信息请求
	 */
	private String waybillDistributeInfoRequest;

	public void setWaybillDistributeInfoRequest(String waybillDistributeInfoRequest) {
		this.waybillDistributeInfoRequest = waybillDistributeInfoRequest;
	}

	public void setWaybillDistributeInfoRequest(WaybillDistributeInfoRequest waybillDistributeInfoRequest) {
		this.waybillDistributeInfoRequest = new JSONWriter(false,true).write(waybillDistributeInfoRequest);
	}

	public String getWaybillDistributeInfoRequest() {
		return this.waybillDistributeInfoRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.distributeinfo";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_distribute_info_request", this.waybillDistributeInfoRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIDistributeinfoResponse> getResponseClass() {
		return WlbWaybillIDistributeinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
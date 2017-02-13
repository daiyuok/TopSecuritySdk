package com.taobao.api.request;

import com.taobao.api.domain.WaybillApplyCancelRequest;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillICancelResponse;

/**
 * TOP API: taobao.wlb.waybill.i.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.24
 */
public class WlbWaybillICancelRequest extends BaseTaobaoRequest<WlbWaybillICancelResponse> {
	
	

	/** 
	* 取消接口入参
	 */
	private String waybillApplyCancelRequest;

	public void setWaybillApplyCancelRequest(String waybillApplyCancelRequest) {
		this.waybillApplyCancelRequest = waybillApplyCancelRequest;
	}

	public void setWaybillApplyCancelRequest(WaybillApplyCancelRequest waybillApplyCancelRequest) {
		this.waybillApplyCancelRequest = new JSONWriter(false,true).write(waybillApplyCancelRequest);
	}

	public String getWaybillApplyCancelRequest() {
		return this.waybillApplyCancelRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_cancel_request", this.waybillApplyCancelRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillICancelResponse> getResponseClass() {
		return WlbWaybillICancelResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
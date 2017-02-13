package com.taobao.api.request;

import com.taobao.api.domain.WaybillProductTypeRequest;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIProductResponse;

/**
 * TOP API: taobao.wlb.waybill.i.product request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.03
 */
public class WlbWaybillIProductRequest extends BaseTaobaoRequest<WlbWaybillIProductResponse> {
	
	

	/** 
	* 查询物流商电子面单产品类型入参
	 */
	private String waybillProductTypeRequest;

	public void setWaybillProductTypeRequest(String waybillProductTypeRequest) {
		this.waybillProductTypeRequest = waybillProductTypeRequest;
	}

	public void setWaybillProductTypeRequest(WaybillProductTypeRequest waybillProductTypeRequest) {
		this.waybillProductTypeRequest = new JSONWriter(false,true).write(waybillProductTypeRequest);
	}

	public String getWaybillProductTypeRequest() {
		return this.waybillProductTypeRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.product";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_product_type_request", this.waybillProductTypeRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIProductResponse> getResponseClass() {
		return WlbWaybillIProductResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
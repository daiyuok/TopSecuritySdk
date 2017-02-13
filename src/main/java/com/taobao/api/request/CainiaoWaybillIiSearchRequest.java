package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoWaybillIiSearchResponse;

/**
 * TOP API: cainiao.waybill.ii.search request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.06
 */
public class CainiaoWaybillIiSearchRequest extends BaseTaobaoRequest<CainiaoWaybillIiSearchResponse> {
	
	

	/** 
	* 物流公司code
	 */
	private String cpCode;

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getCpCode() {
		return this.cpCode;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cp_code", this.cpCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiSearchResponse> getResponseClass() {
		return CainiaoWaybillIiSearchResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
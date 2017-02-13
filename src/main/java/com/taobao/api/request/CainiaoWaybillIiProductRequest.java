package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoWaybillIiProductResponse;

/**
 * TOP API: cainiao.waybill.ii.product request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.04
 */
public class CainiaoWaybillIiProductRequest extends BaseTaobaoRequest<CainiaoWaybillIiProductResponse> {
	
	

	/** 
	* 快递公司code
	 */
	private String cpCode;

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getCpCode() {
		return this.cpCode;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.product";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cp_code", this.cpCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiProductResponse> getResponseClass() {
		return CainiaoWaybillIiProductResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cpCode, "cpCode");
	}
	

}
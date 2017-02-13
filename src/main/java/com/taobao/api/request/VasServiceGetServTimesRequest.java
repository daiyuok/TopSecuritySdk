package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.VasServiceGetServTimesResponse;

/**
 * TOP API: taobao.vas.service.getServTimes request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class VasServiceGetServTimesRequest extends BaseTaobaoRequest<VasServiceGetServTimesResponse> {
	
	

	/** 
	* 服务编码
	 */
	private String servCode;

	public void setServCode(String servCode) {
		this.servCode = servCode;
	}

	public String getServCode() {
		return this.servCode;
	}

	public String getApiMethodName() {
		return "taobao.vas.service.getServTimes";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("serv_code", this.servCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<VasServiceGetServTimesResponse> getResponseClass() {
		return VasServiceGetServTimesResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(servCode, "servCode");
	}
	

}
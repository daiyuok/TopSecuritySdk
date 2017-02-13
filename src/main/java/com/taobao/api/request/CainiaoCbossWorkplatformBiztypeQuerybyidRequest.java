package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCbossWorkplatformBiztypeQuerybyidResponse;

/**
 * TOP API: cainiao.cboss.workplatform.biztype.querybyid request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.14
 */
public class CainiaoCbossWorkplatformBiztypeQuerybyidRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformBiztypeQuerybyidResponse> {
	
	

	/** 
	* 业务类型id
	 */
	private String bizTypeId;

	public void setBizTypeId(String bizTypeId) {
		this.bizTypeId = bizTypeId;
	}

	public String getBizTypeId() {
		return this.bizTypeId;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.biztype.querybyid";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_type_id", this.bizTypeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformBiztypeQuerybyidResponse> getResponseClass() {
		return CainiaoCbossWorkplatformBiztypeQuerybyidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
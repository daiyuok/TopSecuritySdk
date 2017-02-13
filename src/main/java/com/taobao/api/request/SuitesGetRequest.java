package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SuitesGetResponse;

/**
 * TOP API: taobao.suites.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.10
 */
public class SuitesGetRequest extends BaseTaobaoRequest<SuitesGetResponse> {
	
	

	/** 
	* 需要获取的字段列表，不传默认为id,nick,suite_name,start_date,end_date
	 */
	private String fields;

	/** 
	* 用户订购服务的服务码(申请服务的时候会得到)
	 */
	private String serviceCode;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public String getApiMethodName() {
		return "taobao.suites.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("service_code", this.serviceCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SuitesGetResponse> getResponseClass() {
		return SuitesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(serviceCode, "serviceCode");
	}
	

}
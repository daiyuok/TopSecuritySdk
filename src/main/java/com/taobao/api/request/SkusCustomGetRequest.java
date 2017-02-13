package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SkusCustomGetResponse;

/**
 * TOP API: taobao.skus.custom.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class SkusCustomGetRequest extends BaseTaobaoRequest<SkusCustomGetResponse> {
	
	

	/** 
	* 需返回的字段列表。可选值：Sku结构体中的所有字段；字段之间用“,”隔开
	 */
	private String fields;

	/** 
	* Sku的外部商家ID
	 */
	private String outerId;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public String getApiMethodName() {
		return "taobao.skus.custom.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("outer_id", this.outerId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SkusCustomGetResponse> getResponseClass() {
		return SkusCustomGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(outerId, "outerId");
	}
	

}
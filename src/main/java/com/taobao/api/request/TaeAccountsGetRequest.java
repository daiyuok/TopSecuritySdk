package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TaeAccountsGetResponse;

/**
 * TOP API: taobao.tae.accounts.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.03.09
 */
public class TaeAccountsGetRequest extends BaseTaobaoRequest<TaeAccountsGetResponse> {
	
	

	/** 
	* 需要获取的科目ID
	 */
	private String aids;

	/** 
	* 需要返回的字段
	 */
	private String fields;

	public void setAids(String aids) {
		this.aids = aids;
	}

	public String getAids() {
		return this.aids;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "taobao.tae.accounts.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("aids", this.aids);
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TaeAccountsGetResponse> getResponseClass() {
		return TaeAccountsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(aids, 20, "aids");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
	}
	

}
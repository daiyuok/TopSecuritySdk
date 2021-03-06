package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TaeBillGetResponse;

/**
 * TOP API: taobao.tae.bill.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.09
 */
public class TaeBillGetRequest extends BaseTaobaoRequest<TaeBillGetResponse> {
	
	

	/** 
	* 虚拟账户科目编号
	 */
	private Long accountId;

	/** 
	* 账单编号
	 */
	private Long bid;

	/** 
	* 传入需要返回的字段
	 */
	private String fields;

	/** 
	* 账单编号
	 */
	private Long id;

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountId() {
		return this.accountId;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getBid() {
		return this.bid;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public String getApiMethodName() {
		return "taobao.tae.bill.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("account_id", this.accountId);
		txtParams.put("bid", this.bid);
		txtParams.put("fields", this.fields);
		txtParams.put("id", this.id);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TaeBillGetResponse> getResponseClass() {
		return TaeBillGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(accountId, "accountId");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(id, "id");
	}
	

}
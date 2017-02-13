package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.UsersGetResponse;

/**
 * TOP API: taobao.users.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.18
 */
public class UsersGetRequest extends BaseTaobaoRequest<UsersGetResponse> {
	
	

	/** 
	* 查询字段：User数据结构的公开信息字段列表，以半角逗号(,)分隔
	 */
	private String fields;

	/** 
	* 用户昵称，多个以半角逗号(,)分隔，最多40个
	 */
	private String nicks;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}

	public String getNicks() {
		return this.nicks;
	}

	public String getApiMethodName() {
		return "taobao.users.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nicks", this.nicks);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UsersGetResponse> getResponseClass() {
		return UsersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(nicks, "nicks");
	}
	

}
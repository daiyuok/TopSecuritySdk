package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.UserGetResponse;

/**
 * TOP API: taobao.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.22
 */
public class UserGetRequest extends BaseTaobaoRequest<UserGetResponse> {
	
	

	/** 
	* 需返回的字段列表，可选值为返回值中看得到的所有字段。
	 */
	private String fields;

	/** 
	* 用户昵称，session和nick必须传其中一个（其中nick优先），传入nick只能获取用户公开信息，传入session可以获取用户隐私信息
	 */
	private String nick;

	/** 
	* 指定哪个入参是混淆入参
	 */
	private String topMixParams;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setTopMixParams(String topMixParams) {
		this.topMixParams = topMixParams;
	}

	public String getTopMixParams() {
		return this.topMixParams;
	}

	public String getApiMethodName() {
		return "taobao.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("top_mix_params", this.topMixParams);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UserGetResponse> getResponseClass() {
		return UserGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}
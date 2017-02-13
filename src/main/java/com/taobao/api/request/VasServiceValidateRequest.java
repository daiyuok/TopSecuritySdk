package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.VasServiceValidateResponse;

/**
 * TOP API: taobao.vas.service.validate request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.18
 */
public class VasServiceValidateRequest extends BaseTaobaoRequest<VasServiceValidateResponse> {
	
	

	/** 
	* 用户昵称
	 */
	private String nick;

	/** 
	* 服务编码
	 */
	private String servCode;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setServCode(String servCode) {
		this.servCode = servCode;
	}

	public String getServCode() {
		return this.servCode;
	}

	public String getApiMethodName() {
		return "taobao.vas.service.validate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("serv_code", this.servCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<VasServiceValidateResponse> getResponseClass() {
		return VasServiceValidateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
		RequestCheckUtils.checkNotEmpty(servCode, "servCode");
	}
	

}
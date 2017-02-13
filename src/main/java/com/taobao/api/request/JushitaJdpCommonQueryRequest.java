package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpCommonQueryResponse;

/**
 * TOP API: taobao.jushita.jdp.common.query request
 * 
 * @author top auto create
 * @since 1.0, 2014.12.10
 */
public class JushitaJdpCommonQueryRequest extends BaseTaobaoRequest<JushitaJdpCommonQueryResponse> {
	
	

	/** 
	* 查询名称
	 */
	private String cmdName;

	/** 
	* json参数
	 */
	private String params;

	public void setCmdName(String cmdName) {
		this.cmdName = cmdName;
	}

	public String getCmdName() {
		return this.cmdName;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getParams() {
		return this.params;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.common.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cmd_name", this.cmdName);
		txtParams.put("params", this.params);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpCommonQueryResponse> getResponseClass() {
		return JushitaJdpCommonQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cmdName, "cmdName");
		RequestCheckUtils.checkNotEmpty(params, "params");
	}
	

}
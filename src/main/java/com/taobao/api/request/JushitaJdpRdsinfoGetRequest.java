package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpRdsinfoGetResponse;

/**
 * TOP API: taobao.jushita.jdp.rdsinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.26
 */
public class JushitaJdpRdsinfoGetRequest extends BaseTaobaoRequest<JushitaJdpRdsinfoGetResponse> {
	
	

	/** 
	* 查询的appkey
	 */
	private String targetAppkey;

	public void setTargetAppkey(String targetAppkey) {
		this.targetAppkey = targetAppkey;
	}

	public String getTargetAppkey() {
		return this.targetAppkey;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.rdsinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("target_appkey", this.targetAppkey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpRdsinfoGetResponse> getResponseClass() {
		return JushitaJdpRdsinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(targetAppkey, "targetAppkey");
	}
	

}
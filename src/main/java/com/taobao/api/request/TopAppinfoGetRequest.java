package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TopAppinfoGetResponse;

/**
 * TOP API: taobao.top.appinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.20
 */
public class TopAppinfoGetRequest extends BaseTaobaoRequest<TopAppinfoGetResponse> {
	
	

	/** 
	* 查询应用信息的appkey
	 */
	private String appkey;

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getAppkey() {
		return this.appkey;
	}

	public String getApiMethodName() {
		return "taobao.top.appinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("appkey", this.appkey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopAppinfoGetResponse> getResponseClass() {
		return TopAppinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appkey, "appkey");
	}
	

}
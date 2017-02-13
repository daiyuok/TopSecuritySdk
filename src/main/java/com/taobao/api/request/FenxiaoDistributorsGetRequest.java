package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDistributorsGetResponse;

/**
 * TOP API: taobao.fenxiao.distributors.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoDistributorsGetRequest extends BaseTaobaoRequest<FenxiaoDistributorsGetResponse> {
	
	

	/** 
	* 分销商用户名列表。多个之间以“,”分隔;最多支持50个分销商用户名。
	 */
	private String nicks;

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}

	public String getNicks() {
		return this.nicks;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.distributors.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nicks", this.nicks);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDistributorsGetResponse> getResponseClass() {
		return FenxiaoDistributorsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nicks, "nicks");
	}
	

}
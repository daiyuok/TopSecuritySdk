package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TopApiSyncResponse;

/**
 * TOP API: taobao.top.api.sync request
 * 
 * @author top auto create
 * @since 1.0, 2015.01.18
 */
public class TopApiSyncRequest extends BaseTaobaoRequest<TopApiSyncResponse> {
	
	

	/** 
	* 要同步的api的名称
	 */
	private String apiName;

	/** 
	* 是否生成定义文件
	 */
	private Boolean createDefine;

	/** 
	* 环境。可选值：SANDBOX(沙箱)、DAILY(Daily)、PREPUBLISH(预发)、PRODUCTION(生产)
	 */
	private String environment;

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setCreateDefine(Boolean createDefine) {
		this.createDefine = createDefine;
	}

	public Boolean getCreateDefine() {
		return this.createDefine;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public String getApiMethodName() {
		return "taobao.top.api.sync";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("api_name", this.apiName);
		txtParams.put("create_define", this.createDefine);
		txtParams.put("environment", this.environment);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopApiSyncResponse> getResponseClass() {
		return TopApiSyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(apiName, "apiName");
		RequestCheckUtils.checkNotEmpty(environment, "environment");
	}
	

}
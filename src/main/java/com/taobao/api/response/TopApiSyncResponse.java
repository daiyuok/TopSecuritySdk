package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ApiSyncInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.api.sync response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopApiSyncResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8582574417459572243L;

	/** 
	 * API同步信息
	 */
	@ApiField("api_sync_info")
	private ApiSyncInfo apiSyncInfo;


	public void setApiSyncInfo(ApiSyncInfo apiSyncInfo) {
		this.apiSyncInfo = apiSyncInfo;
	}
	public ApiSyncInfo getApiSyncInfo( ) {
		return this.apiSyncInfo;
	}
	


}

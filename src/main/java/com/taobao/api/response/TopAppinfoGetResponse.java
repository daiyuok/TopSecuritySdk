package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AppBaseInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.appinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopAppinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4811356199644148987L;

	/** 
	 * app信息
	 */
	@ApiField("app_info")
	private AppBaseInfo appInfo;


	public void setAppInfo(AppBaseInfo appInfo) {
		this.appInfo = appInfo;
	}
	public AppBaseInfo getAppInfo( ) {
		return this.appInfo;
	}
	


}

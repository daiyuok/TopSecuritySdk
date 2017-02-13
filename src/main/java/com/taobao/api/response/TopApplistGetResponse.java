package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AppBaseInfo;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.applist.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopApplistGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6764579424258661817L;

	/** 
	 * App列表信息
	 */
	@ApiListField("app_base_infos")
	@ApiField("app_base_info")
	private List<AppBaseInfo> appBaseInfos;


	public void setAppBaseInfos(List<AppBaseInfo> appBaseInfos) {
		this.appBaseInfos = appBaseInfos;
	}
	public List<AppBaseInfo> getAppBaseInfos( ) {
		return this.appBaseInfos;
	}
	


}

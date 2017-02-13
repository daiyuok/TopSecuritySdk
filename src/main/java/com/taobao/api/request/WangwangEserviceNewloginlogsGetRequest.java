package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangEserviceNewloginlogsGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.newloginlogs.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.01.17
 */
public class WangwangEserviceNewloginlogsGetRequest extends BaseTaobaoRequest<WangwangEserviceNewloginlogsGetResponse> {
	
	

	/** 
	* 查询登录日志的开始日期，必须按示例的格式，否则会返回错误；
开始时间不能在当前时间30天前，开始时间和结束时间的间隔不能超过7天；
开始时间不能超过当前系统时间
	 */
	private String btime;

	/** 
	* 查询登录日志的结束时间，必须按示例的格式，否则会返回错误；
结束时间不能小于开始时间，结束时间和开始时间的间隔不能超过7天
	 */
	private String etime;

	/** 
	* 需要查询登录日志的账号列表，多个id之间用逗号隔开，每次查询的id数不能超过30个
	 */
	private String queryIds;

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String getBtime() {
		return this.btime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getEtime() {
		return this.etime;
	}

	public void setQueryIds(String queryIds) {
		this.queryIds = queryIds;
	}

	public String getQueryIds() {
		return this.queryIds;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.newloginlogs.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("btime", this.btime);
		txtParams.put("etime", this.etime);
		txtParams.put("query_ids", this.queryIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangEserviceNewloginlogsGetResponse> getResponseClass() {
		return WangwangEserviceNewloginlogsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(btime, "btime");
		RequestCheckUtils.checkNotEmpty(etime, "etime");
		RequestCheckUtils.checkNotEmpty(queryIds, "queryIds");
		RequestCheckUtils.checkMaxListSize(queryIds, 30, "queryIds");
	}
	

}
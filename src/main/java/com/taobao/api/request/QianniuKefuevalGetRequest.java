package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.QianniuKefuevalGetResponse;

/**
 * TOP API: taobao.qianniu.kefueval.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.08
 */
public class QianniuKefuevalGetRequest extends BaseTaobaoRequest<QianniuKefuevalGetResponse> {
	
	

	/** 
	* 开始时间，格式yyyyMMddHHmmss
	 */
	private String btime;

	/** 
	* 结束时间,格式yyyyMMddHHmmss
	 */
	private String etime;

	/** 
	* 客服的nick，多个用逗号分隔，不要超过10个，带cntaobao的长nick
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
		return "taobao.qianniu.kefueval.get";
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

	public Class<QianniuKefuevalGetResponse> getResponseClass() {
		return QianniuKefuevalGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(btime, "btime");
		RequestCheckUtils.checkNotEmpty(etime, "etime");
		RequestCheckUtils.checkNotEmpty(queryIds, "queryIds");
	}
	

}
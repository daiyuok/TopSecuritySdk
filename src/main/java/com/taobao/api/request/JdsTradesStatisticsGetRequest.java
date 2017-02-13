package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JdsTradesStatisticsGetResponse;

/**
 * TOP API: taobao.jds.trades.statistics.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.13
 */
public class JdsTradesStatisticsGetRequest extends BaseTaobaoRequest<JdsTradesStatisticsGetResponse> {
	
	

	/** 
	* 查询的日期，格式如YYYYMMDD的日期对应的数字
	 */
	private Long date;

	public void setDate(Long date) {
		this.date = date;
	}

	public Long getDate() {
		return this.date;
	}

	public String getApiMethodName() {
		return "taobao.jds.trades.statistics.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("date", this.date);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JdsTradesStatisticsGetResponse> getResponseClass() {
		return JdsTradesStatisticsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(date, "date");
	}
	

}
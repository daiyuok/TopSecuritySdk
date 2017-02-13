package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpUserAddResponse;

/**
 * TOP API: taobao.jushita.jdp.user.add request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.20
 */
public class JushitaJdpUserAddRequest extends BaseTaobaoRequest<JushitaJdpUserAddResponse> {
	
	

	/** 
	* 推送历史数据天数，只能为90天内，包含90天。当此参数不填时，表示以页面中应用配置的历史天数为准；如果为0表示这个用户不推送历史数据；其它表示推送的历史天数。
	 */
	private Long historyDays;

	/** 
	* 已废弃，新版订单同步服务不要使用。同步用户数据的机器IP,必须是界面配置的IP。
	 */
	private String hostIp;

	/** 
	* 已废弃，新版订单同步服务不要使用。绑定类型，用户数据同步的机器名称。
	 */
	private String hostName;

	/** 
	* RDS实例名称
	 */
	private String rdsName;

	/** 
	* 已废弃，使用页面中应用的配置。用户同步的数据类型,多个用','号分割。可选值：trade,refund,item
	 */
	private String topics;

	public void setHistoryDays(Long historyDays) {
		this.historyDays = historyDays;
	}

	public Long getHistoryDays() {
		return this.historyDays;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getHostIp() {
		return this.hostIp;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setRdsName(String rdsName) {
		this.rdsName = rdsName;
	}

	public String getRdsName() {
		return this.rdsName;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getTopics() {
		return this.topics;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.user.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("history_days", this.historyDays);
		txtParams.put("host_ip", this.hostIp);
		txtParams.put("host_name", this.hostName);
		txtParams.put("rds_name", this.rdsName);
		txtParams.put("topics", this.topics);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpUserAddResponse> getResponseClass() {
		return JushitaJdpUserAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(historyDays, 90L, "historyDays");
		RequestCheckUtils.checkMinValue(historyDays, 0L, "historyDays");
		RequestCheckUtils.checkMaxLength(hostName, 60, "hostName");
		RequestCheckUtils.checkNotEmpty(rdsName, "rdsName");
		RequestCheckUtils.checkMaxListSize(topics, 16, "topics");
	}
	

}
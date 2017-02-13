package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpTaskUpdateResponse;

/**
 * TOP API: taobao.jushita.jdp.task.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.16
 */
public class JushitaJdpTaskUpdateRequest extends BaseTaobaoRequest<JushitaJdpTaskUpdateResponse> {
	
	

	/** 
	* 任务执行失败的错误信息，可以方便排查问题。
	 */
	private String errorMessage;

	/** 
	* 任务执行的机器主机名,用于方便排查问题。
	 */
	private String executeHost;

	/** 
	* 任务的编号
	 */
	private Long id;

	/** 
	* 任务的下次开始执行时间。
	 */
	private Date nextExecuteTime;

	/** 
	* 任务当前同步到的时间点。
	 */
	private Date nowSyncTime;

	/** 
	* 任务的参数，用json格式表示
	 */
	private String params;

	/** 
	* 任务的状态，0表示任务新建或未执行完成，1表示任务停止，2表示任务已经完成，-1表示任务执行失败。
	 */
	private Long status;

	/** 
	* 普通isv不能传入此参数
	 */
	private String targetAppkey;

	/** 
	* 任务的类型,
	 */
	private Long type;

	/** 
	* 任务更新时的版本号，此值在选择出的任务中获取到。
	 */
	private Long version;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setExecuteHost(String executeHost) {
		this.executeHost = executeHost;
	}

	public String getExecuteHost() {
		return this.executeHost;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setNextExecuteTime(Date nextExecuteTime) {
		this.nextExecuteTime = nextExecuteTime;
	}

	public Date getNextExecuteTime() {
		return this.nextExecuteTime;
	}

	public void setNowSyncTime(Date nowSyncTime) {
		this.nowSyncTime = nowSyncTime;
	}

	public Date getNowSyncTime() {
		return this.nowSyncTime;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getParams() {
		return this.params;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setTargetAppkey(String targetAppkey) {
		this.targetAppkey = targetAppkey;
	}

	public String getTargetAppkey() {
		return this.targetAppkey;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.task.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("error_message", this.errorMessage);
		txtParams.put("execute_host", this.executeHost);
		txtParams.put("id", this.id);
		txtParams.put("next_execute_time", this.nextExecuteTime);
		txtParams.put("now_sync_time", this.nowSyncTime);
		txtParams.put("params", this.params);
		txtParams.put("status", this.status);
		txtParams.put("target_appkey", this.targetAppkey);
		txtParams.put("type", this.type);
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpTaskUpdateResponse> getResponseClass() {
		return JushitaJdpTaskUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(errorMessage, 100, "errorMessage");
		RequestCheckUtils.checkMaxLength(executeHost, 30, "executeHost");
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkNotEmpty(nextExecuteTime, "nextExecuteTime");
		RequestCheckUtils.checkNotEmpty(nowSyncTime, "nowSyncTime");
		RequestCheckUtils.checkMaxLength(params, 512, "params");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkMaxValue(status, 2L, "status");
		RequestCheckUtils.checkMinValue(status, -1L, "status");
		RequestCheckUtils.checkMinValue(type, 0L, "type");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}
package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 数据推送任务
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DataPushTask extends TaobaoObject {

	private static final long serialVersionUID = 6857261469215837819L;

	/**
	 * 任务所属的appkey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 任务创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 任务编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 下次执行时间
	 */
	@ApiField("next_execute_time")
	private Date nextExecuteTime;

	/**
	 * 上一次同步到的时间点
	 */
	@ApiField("now_sync_time")
	private Date nowSyncTime;

	/**
	 * 任务的业务参数，用json格式表示
	 */
	@ApiField("params")
	private String params;

	/**
	 * 任务类型代码
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 任务所属的用户编号
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 用户的nick
	 */
	@ApiField("user_nick")
	private String userNick;

	/**
	 * 任务的版本号，在更新任务时，需要用到此数据
	 */
	@ApiField("version")
	private Long version;


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Date getNextExecuteTime() {
		return this.nextExecuteTime;
	}
	public void setNextExecuteTime(Date nextExecuteTime) {
		this.nextExecuteTime = nextExecuteTime;
	}

	public Date getNowSyncTime() {
		return this.nowSyncTime;
	}
	public void setNowSyncTime(Date nowSyncTime) {
		this.nowSyncTime = nowSyncTime;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public Long getVersion() {
		return this.version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

}

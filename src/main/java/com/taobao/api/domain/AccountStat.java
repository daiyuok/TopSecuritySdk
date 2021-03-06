package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * E客服账号操作记录
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AccountStat extends TaobaoObject {

	private static final long serialVersionUID = 4276714326476129455L;

	/**
	 * 登录状态。0：离线；1：在线
	 */
	@ApiField("login_status")
	private Long loginStatus;

	/**
	 * 服务状态。0：挂起；1：服务
	 */
	@ApiField("onservice_status")
	private Long onserviceStatus;

	/**
	 * 操作时间。格式：YYYY-mm-dd HH:MM:SS
	 */
	@ApiField("time")
	private String time;


	public Long getLoginStatus() {
		return this.loginStatus;
	}
	public void setLoginStatus(Long loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Long getOnserviceStatus() {
		return this.onserviceStatus;
	}
	public void setOnserviceStatus(Long onserviceStatus) {
		this.onserviceStatus = onserviceStatus;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}

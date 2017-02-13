package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * App基本信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AppBaseInfo extends TaobaoObject {

	private static final long serialVersionUID = 1351433315126255551L;

	/**
	 * app状态，1.线上运行, 2. 正式环境测试中, 6.开发中
	 */
	@ApiField("app_status")
	private Long appStatus;

	/**
	 * app的唯一标识：app key
	 */
	@ApiField("appkey")
	private String appkey;

	/**
	 * app描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * isv的数字id
	 */
	@ApiField("isv_id")
	private Long isvId;

	/**
	 * Null
	 */
	@ApiField("support_email")
	private String supportEmail;

	/**
	 * app名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 开发者旺旺
	 */
	@ApiField("wangwang")
	private String wangwang;


	public Long getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(Long appStatus) {
		this.appStatus = appStatus;
	}

	public String getAppkey() {
		return this.appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIsvId() {
		return this.isvId;
	}
	public void setIsvId(Long isvId) {
		this.isvId = isvId;
	}

	public String getSupportEmail() {
		return this.supportEmail;
	}
	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWangwang() {
		return this.wangwang;
	}
	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

}

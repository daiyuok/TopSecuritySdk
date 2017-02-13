package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * rds的配置信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RdsConfig extends TaobaoObject {

	private static final long serialVersionUID = 5532719745932142685L;

	/**
	 * appkey
	 */
	@ApiField("appkey")
	private String appkey;

	/**
	 * 数据库tdp密码
	 */
	@ApiField("db_tdp_ps")
	private String dbTdpPs;

	/**
	 * 数据库tdp用户名
	 */
	@ApiField("db_tdp_user")
	private String dbTdpUser;

	/**
	 * 数据库类型，mysql/sqlserver
	 */
	@ApiField("db_type")
	private String dbType;

	/**
	 * 数据库用户名
	 */
	@ApiField("db_user")
	private String dbUser;

	/**
	 * 主机地址
	 */
	@ApiField("host")
	private String host;

	/**
	 * 数据推送rds表里的id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * rds数据库实例名
	 */
	@ApiField("name")
	private String name;

	/**
	 * rds数据库端口
	 */
	@ApiField("port")
	private String port;

	/**
	 * 数据库状态
	 */
	@ApiField("status")
	private String status;


	public String getAppkey() {
		return this.appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getDbTdpPs() {
		return this.dbTdpPs;
	}
	public void setDbTdpPs(String dbTdpPs) {
		this.dbTdpPs = dbTdpPs;
	}

	public String getDbTdpUser() {
		return this.dbTdpUser;
	}
	public void setDbTdpUser(String dbTdpUser) {
		this.dbTdpUser = dbTdpUser;
	}

	public String getDbType() {
		return this.dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbUser() {
		return this.dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getHost() {
		return this.host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPort() {
		return this.port;
	}
	public void setPort(String port) {
		this.port = port;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

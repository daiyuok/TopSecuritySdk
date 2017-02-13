package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 使用数据推送的用户信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class JdpUser extends TaobaoObject {

	private static final long serialVersionUID = 3584419436244273549L;

	/**
	 * 和数据回流绑定的appkey，用户的数据推到此appkey对应的rds后，会回传X_DOWNLOADED消息
	 */
	@ApiField("hl_appkey")
	private String hlAppkey;

	/**
	 * 用户等级，用于区分大卖家，值越大则订单量越大
	 */
	@ApiField("level")
	private Long level;

	/**
	 * rds的id，平台appkey会返回rds_id而不是rds_name
	 */
	@ApiField("rds_id")
	private Long rdsId;

	/**
	 * rds数据库的实例名
	 */
	@ApiField("rds_name")
	private String rdsName;

	/**
	 * 卖家类型，B表示商城卖家，C表示淘宝卖家
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * 0:暂停1：正常2：sessoin失效，停止3：已删除
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 用户昵称
	 */
	@ApiField("user_nick")
	private String userNick;


	public String getHlAppkey() {
		return this.hlAppkey;
	}
	public void setHlAppkey(String hlAppkey) {
		this.hlAppkey = hlAppkey;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getRdsId() {
		return this.rdsId;
	}
	public void setRdsId(Long rdsId) {
		this.rdsId = rdsId;
	}

	public String getRdsName() {
		return this.rdsName;
	}
	public void setRdsName(String rdsName) {
		this.rdsName = rdsName;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
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

}

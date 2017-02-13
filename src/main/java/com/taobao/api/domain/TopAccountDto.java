package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 费用科目
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TopAccountDto extends TaobaoObject {

	private static final long serialVersionUID = 7392852569448525761L;

	/**
	 * 费用科目编码
	 */
	@ApiField("account_code")
	private String accountCode;

	/**
	 * 费用科目编号
	 */
	@ApiField("account_id")
	private Long accountId;

	/**
	 * 费用科目名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 费用科目类型:1-虚拟账户 2-交易 3-交易佣金 4-服务费 5-天猫积分 6-其他
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 是否订单相关:0-订单无关 1-订单相关
	 */
	@ApiField("related_order")
	private Long relatedOrder;

	/**
	 * 状态:0-不可用 1-可用
	 */
	@ApiField("status")
	private Long status;


	public String getAccountCode() {
		return this.accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public Long getAccountId() {
		return this.accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getAccountType() {
		return this.accountType;
	}
	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getRelatedOrder() {
		return this.relatedOrder;
	}
	public void setRelatedOrder(Long relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}

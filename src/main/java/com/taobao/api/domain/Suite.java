package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 套餐
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Suite extends TaobaoObject {

	private static final long serialVersionUID = 1322113169728632893L;

	/**
	 * 订购套餐结束时间。
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 套餐id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 分销商昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 订购套餐开始时间。
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 套餐名
	 */
	@ApiField("suite_name")
	private String suiteName;


	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSuiteName() {
		return this.suiteName;
	}
	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}

}

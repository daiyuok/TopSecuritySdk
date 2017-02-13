package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商家的仓库信息详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class StoreInfo extends TaobaoObject {

	private static final long serialVersionUID = 5581149646119387773L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * XXX果园
	 */
	@ApiField("name")
	private String name;

	/**
	 * 仓库真实名字
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 仓库服务代码
	 */
	@ApiField("service_code")
	private String serviceCode;


	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}

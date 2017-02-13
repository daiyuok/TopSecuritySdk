package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillDistributeInfo extends TaobaoObject {

	private static final long serialVersionUID = 7684939744425314117L;

	/**
	 * 结果所对应的地址对信息
	 */
	@ApiField("address_pair")
	private AddressPair addressPair;

	/**
	 * 收货网点编码
	 */
	@ApiField("consignee_branch_code")
	private String consigneeBranchCode;

	/**
	 * 收货网点名称
	 */
	@ApiField("consignee_branch_name")
	private String consigneeBranchName;

	/**
	 * 错误编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 集包地编码
	 */
	@ApiField("package_center_code")
	private String packageCenterCode;

	/**
	 * 集包地名称
	 */
	@ApiField("package_center_name")
	private String packageCenterName;

	/**
	 * 结果编码
	 */
	@ApiField("result")
	private Long result;

	/**
	 * 大头笔信息
	 */
	@ApiField("short_address")
	private String shortAddress;


	public AddressPair getAddressPair() {
		return this.addressPair;
	}
	public void setAddressPair(AddressPair addressPair) {
		this.addressPair = addressPair;
	}

	public String getConsigneeBranchCode() {
		return this.consigneeBranchCode;
	}
	public void setConsigneeBranchCode(String consigneeBranchCode) {
		this.consigneeBranchCode = consigneeBranchCode;
	}

	public String getConsigneeBranchName() {
		return this.consigneeBranchName;
	}
	public void setConsigneeBranchName(String consigneeBranchName) {
		this.consigneeBranchName = consigneeBranchName;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getPackageCenterCode() {
		return this.packageCenterCode;
	}
	public void setPackageCenterCode(String packageCenterCode) {
		this.packageCenterCode = packageCenterCode;
	}

	public String getPackageCenterName() {
		return this.packageCenterName;
	}
	public void setPackageCenterName(String packageCenterName) {
		this.packageCenterName = packageCenterName;
	}

	public Long getResult() {
		return this.result;
	}
	public void setResult(Long result) {
		this.result = result;
	}

	public String getShortAddress() {
		return this.shortAddress;
	}
	public void setShortAddress(String shortAddress) {
		this.shortAddress = shortAddress;
	}

}

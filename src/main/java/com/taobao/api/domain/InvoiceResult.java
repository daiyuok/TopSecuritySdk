package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发票返回数据对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class InvoiceResult extends TaobaoObject {

	private static final long serialVersionUID = 7122448359358959591L;

	/**
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 错误编码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/**
	 * 错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/**
	 * 发票密文，密码区的字符串
	 */
	@ApiField("ciphertext")
	private String ciphertext;

	/**
	 * 税控设备编号(新版电子发票有)
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * erp自定义单据号
	 */
	@ApiField("erp_tid")
	private String erpTid;

	/**
	 * 文件类型(pdf,jpg,png)
	 */
	@ApiField("file_data_type")
	private String fileDataType;

	/**
	 * 发票PDF的下载地址(仅在单个查询接口上显示，批量查询不显示)
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票明细
	 */
	@ApiField("invoice_items")
	private String invoiceItems;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票(开票)类型，蓝票blue,红票red，默认blue
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 收款方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 开票方电话
	 */
	@ApiField("payee_phone")
	private String payeePhone;

	/**
	 * 收款方税务登记证号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 付款方名称, 对应发票title
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 电商平台代码。淘宝：taobao，天猫：tmall
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 电商平台订单号
	 */
	@ApiField("platform_tid")
	private String platformTid;

	/**
	 * 二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求。
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 开票状态 (waiting = 开票中) 、(create_success = 开票成功)、(create_failed = 开票失败)
	 */
	@ApiField("status")
	private String status;


	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

	public String getBizErrorCode() {
		return this.bizErrorCode;
	}
	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}

	public String getBizErrorMsg() {
		return this.bizErrorMsg;
	}
	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}

	public String getCiphertext() {
		return this.ciphertext;
	}
	public void setCiphertext(String ciphertext) {
		this.ciphertext = ciphertext;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getErpTid() {
		return this.erpTid;
	}
	public void setErpTid(String erpTid) {
		this.erpTid = erpTid;
	}

	public String getFileDataType() {
		return this.fileDataType;
	}
	public void setFileDataType(String fileDataType) {
		this.fileDataType = fileDataType;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceItems() {
		return this.invoiceItems;
	}
	public void setInvoiceItems(String invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeePhone() {
		return this.payeePhone;
	}
	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}
	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 电子发票对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ProviderEinvoice extends TaobaoObject {

	private static final long serialVersionUID = 2369666292839958685L;

	/**
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 密文（密码区的字符串)
	 */
	@ApiField("ciphertext")
	private String ciphertext;

	/**
	 * 税控设备编号(新版电子发票有)
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * erp自定义订单号
	 */
	@ApiField("erp_tid")
	private String erpTid;

	/**
	 * 文件类型(pdf,jpg,png)
	 */
	@ApiField("file_data_type")
	private String fileDataType;

	/**
	 * 实际开票金额
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
	@ApiField("invoice_date_time")
	private String invoiceDateTime;

	/**
	 * 发票文件PDF内容，PDF的byte[]用base64编码后的字段串。
	 */
	@ApiField("invoice_file_data")
	private String invoiceFileData;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 电子发票流水号，标记业务上的唯一请求
	 */
	@ApiField("serial_no")
	private String serialNo;


	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
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

	public String getInvoiceDateTime() {
		return this.invoiceDateTime;
	}
	public void setInvoiceDateTime(String invoiceDateTime) {
		this.invoiceDateTime = invoiceDateTime;
	}

	public String getInvoiceFileData() {
		return this.invoiceFileData;
	}
	public void setInvoiceFileData(String invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
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

}

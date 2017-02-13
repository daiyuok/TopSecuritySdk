package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.provider.einvoice.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaProviderEinvoiceCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3876644935722348676L;

	/** 
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

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
	@ApiField("invoice_date")
	private String invoiceDate;

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
	 * 电商平台身份标识码，如taobao,tmall
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
	 * 电子发票流水号，标记业务上的唯一请求
	 */
	@ApiField("serial_no")
	private String serialNo;


	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}
	public String getAntiFakeCode( ) {
		return this.antiFakeCode;
	}

	public void setCiphertext(String ciphertext) {
		this.ciphertext = ciphertext;
	}
	public String getCiphertext( ) {
		return this.ciphertext;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getDeviceNo( ) {
		return this.deviceNo;
	}

	public void setErpTid(String erpTid) {
		this.erpTid = erpTid;
	}
	public String getErpTid( ) {
		return this.erpTid;
	}

	public void setFileDataType(String fileDataType) {
		this.fileDataType = fileDataType;
	}
	public String getFileDataType( ) {
		return this.fileDataType;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceDate( ) {
		return this.invoiceDate;
	}

	public void setInvoiceFileData(String invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}
	public String getInvoiceFileData( ) {
		return this.invoiceFileData;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}
	public String getPlatformCode( ) {
		return this.platformCode;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}
	public String getPlatformTid( ) {
		return this.platformTid;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}
	


}

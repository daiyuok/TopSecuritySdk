package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaElectronicInvoiceUploadResponse;

/**
 * TOP API: alibaba.electronic.invoice.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.08
 */
public class AlibabaElectronicInvoiceUploadRequest extends BaseTaobaoRequest<AlibabaElectronicInvoiceUploadResponse> implements TaobaoUploadRequest<AlibabaElectronicInvoiceUploadResponse> {

	
	

	/** 
	* 防伪码
	 */
	private String antiFakeCode;

	/** 
	* 电子发票号(一般是:发票代码+发票号码)
	 */
	private String electronicInvoiceNo;

	/** 
	* 开票金额（价税合计金额），格式:100.00, 冲红时格式为"-100.00"
	 */
	private String invoiceAmount;

	/** 
	* 发票代码
	 */
	private String invoiceCode;

	/** 
	* 发票文件内容,目前只支持jpg,png,bmp,pdf格式
	 */
	private FileItem invoiceFileData;

	/** 
	* 发票号码
	 */
	private String invoiceNo;

	/** 
	* 开票日期, 格式"YYYY-MM-DD HH:SS:MM"
	 */
	private Date invoiceTime;

	/** 
	* 1 蓝票 2 红票
	 */
	private Long invoiceType;

	/** 
	* 二维码,二维码扫码的结果。
	 */
	private String qrCode;

	/** 
	* 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求, 由于ERP根据自己的业务请求确定。可采用订单id+操作代码，比如：订单号转成十六进制 +  操作代码（表示红票还是蓝票）+ 操作序号
	 */
	private String serialNo;

	/** 
	* 淘宝的主订单id
	 */
	private Long tid;

	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}

	public void setElectronicInvoiceNo(String electronicInvoiceNo) {
		this.electronicInvoiceNo = electronicInvoiceNo;
	}

	public String getElectronicInvoiceNo() {
		return this.electronicInvoiceNo;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceFileData(FileItem invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}

	public FileItem getInvoiceFileData() {
		return this.invoiceFileData;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceTime(Date invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public Date getInvoiceTime() {
		return this.invoiceTime;
	}

	public void setInvoiceType(Long invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Long getInvoiceType() {
		return this.invoiceType;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getQrCode() {
		return this.qrCode;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "alibaba.electronic.invoice.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("anti_fake_code", this.antiFakeCode);
		txtParams.put("electronic_invoice_no", this.electronicInvoiceNo);
		txtParams.put("invoice_amount", this.invoiceAmount);
		txtParams.put("invoice_code", this.invoiceCode);
		txtParams.put("invoice_no", this.invoiceNo);
		txtParams.put("invoice_time", this.invoiceTime);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("qr_code", this.qrCode);
		txtParams.put("serial_no", this.serialNo);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaElectronicInvoiceUploadResponse> getResponseClass() {
		return AlibabaElectronicInvoiceUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(antiFakeCode, 20, "antiFakeCode");
		RequestCheckUtils.checkNotEmpty(electronicInvoiceNo, "electronicInvoiceNo");
		RequestCheckUtils.checkMaxLength(electronicInvoiceNo, 20, "electronicInvoiceNo");
		RequestCheckUtils.checkNotEmpty(invoiceAmount, "invoiceAmount");
		RequestCheckUtils.checkNotEmpty(invoiceCode, "invoiceCode");
		RequestCheckUtils.checkMaxLength(invoiceCode, 20, "invoiceCode");
		RequestCheckUtils.checkNotEmpty(invoiceFileData, "invoiceFileData");
		RequestCheckUtils.checkNotEmpty(invoiceNo, "invoiceNo");
		RequestCheckUtils.checkMaxLength(invoiceNo, 20, "invoiceNo");
		RequestCheckUtils.checkNotEmpty(invoiceTime, "invoiceTime");
		RequestCheckUtils.checkNotEmpty(invoiceType, "invoiceType");
		RequestCheckUtils.checkMaxValue(invoiceType, 2L, "invoiceType");
		RequestCheckUtils.checkMinValue(invoiceType, 1L, "invoiceType");
		RequestCheckUtils.checkMaxLength(qrCode, 3000, "qrCode");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
		RequestCheckUtils.checkMaxLength(serialNo, 30, "serialNo");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("invoice_file_data", this.invoiceFileData);
		return params;
	}
	
	

}
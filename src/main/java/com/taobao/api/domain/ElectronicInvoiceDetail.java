package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 电子发票详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ElectronicInvoiceDetail extends TaobaoObject {

	private static final long serialVersionUID = 1461138178564323791L;

	/**
	 * 电子发票号
	 */
	@ApiField("electronic_invoice_no")
	private String electronicInvoiceNo;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票的下载地址，7天失效。
	 */
	@ApiField("invoice_file_url")
	private String invoiceFileUrl;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_time")
	private String invoiceTime;

	/**
	 * 1 蓝票 2 红票
	 */
	@ApiField("invoice_type")
	private Long invoiceType;

	/**
	 * 开票流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 当前开票类型的开票状态，0:等待开票, 1:开票中，2:开票完成。具体的开票类型参考invoice_type字段。status与invoice_type一起决定是蓝票的开票状态，还是红票的开票状态。如果状态是0或1时，除了invoice_type外的其它返回字段表示上一次开票结果。在调用alibaba.electronic.invoice.prepare前为等待开票；在调用alibaba.electronic.invoice.upload前为开票中；在调用alibaba.electronic.invoice.upload后为开票完成。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 淘宝的主订单id
	 */
	@ApiField("tid")
	private Long tid;


	public String getElectronicInvoiceNo() {
		return this.electronicInvoiceNo;
	}
	public void setElectronicInvoiceNo(String electronicInvoiceNo) {
		this.electronicInvoiceNo = electronicInvoiceNo;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceFileUrl() {
		return this.invoiceFileUrl;
	}
	public void setInvoiceFileUrl(String invoiceFileUrl) {
		this.invoiceFileUrl = invoiceFileUrl;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceTime() {
		return this.invoiceTime;
	}
	public void setInvoiceTime(String invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public Long getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(Long invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}

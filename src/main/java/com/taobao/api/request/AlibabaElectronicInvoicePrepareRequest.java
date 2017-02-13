package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaElectronicInvoicePrepareResponse;

/**
 * TOP API: alibaba.electronic.invoice.prepare request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.16
 */
public class AlibabaElectronicInvoicePrepareRequest extends BaseTaobaoRequest<AlibabaElectronicInvoicePrepareResponse> {
	
	

	/** 
	* 开票操作类型：1 交易成功 2 退货、退款成功 3 电子换纸质 4 换发票内容（抬头的变化等，其他未归类的情况可以填为4）。第1次开蓝票值必须是1，后续冲红及再冲蓝invoice_action_type都不能值为1。比如如果是退货退款发生时， 开红票蓝票都传2
	 */
	private Long invoiceActionType;

	/** 
	* <span style=
	 */
	private String invoiceTitle;

	/** 
	* 发票类型，1:蓝票，2:红票
	 */
	private Long invoiceType;

	/** 
	* 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求, 由于ERP根据自己的业务请求确定。可采用订单id+操作代码。比如：订单号转成十六进制或36进程 + 操作代码（表示红票还是蓝票）+ 操作序号。
	 */
	private String serialNo;

	/** 
	* 淘宝的主订单id
	 */
	private Long tid;

	public void setInvoiceActionType(Long invoiceActionType) {
		this.invoiceActionType = invoiceActionType;
	}

	public Long getInvoiceActionType() {
		return this.invoiceActionType;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	public void setInvoiceType(Long invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Long getInvoiceType() {
		return this.invoiceType;
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
		return "alibaba.electronic.invoice.prepare";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("invoice_action_type", this.invoiceActionType);
		txtParams.put("invoice_title", this.invoiceTitle);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("serial_no", this.serialNo);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaElectronicInvoicePrepareResponse> getResponseClass() {
		return AlibabaElectronicInvoicePrepareResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(invoiceActionType, "invoiceActionType");
		RequestCheckUtils.checkMaxValue(invoiceActionType, 4L, "invoiceActionType");
		RequestCheckUtils.checkMinValue(invoiceActionType, 1L, "invoiceActionType");
		RequestCheckUtils.checkMaxLength(invoiceTitle, 50, "invoiceTitle");
		RequestCheckUtils.checkNotEmpty(invoiceType, "invoiceType");
		RequestCheckUtils.checkMaxValue(invoiceType, 2L, "invoiceType");
		RequestCheckUtils.checkMinValue(invoiceType, 1L, "invoiceType");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
		RequestCheckUtils.checkMaxLength(serialNo, 30, "serialNo");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
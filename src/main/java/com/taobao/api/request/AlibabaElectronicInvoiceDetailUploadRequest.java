package com.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlibabaElectronicInvoiceDetailUploadResponse;

/**
 * TOP API: alibaba.electronic.invoice.detail.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.09
 */
public class AlibabaElectronicInvoiceDetailUploadRequest extends BaseTaobaoRequest<AlibabaElectronicInvoiceDetailUploadResponse> implements TaobaoUploadRequest<AlibabaElectronicInvoiceDetailUploadResponse> {

	
	

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
	* {}
	 */
	private String invoiceItems;

	/** 
	* 发票号码
	 */
	private String invoiceNo;

	/** 
	* 开票日期, 格式"YYYY-MM-DD HH:SS:MM"
	 */
	private Date invoiceTime;

	/** 
	* 发票抬头，付款方名称
	 */
	private String invoiceTitle;

	/** 
	* 1 蓝票 2 红票
	 */
	private Long invoiceType;

	/** 
	* 回流红票时，对应的原蓝票发票代码
	 */
	private String normalInvoiceCode;

	/** 
	* 回流红票时，对应的原蓝票发票号码
	 */
	private String normalInvoiceNo;

	/** 
	* 开票方名称，xx商城
	 */
	private String payeeName;

	/** 
	* 收款方税务登记号
	 */
	private String payeeRegisterNo;

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

	public void setInvoiceItems(String invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
		this.invoiceItems = new JSONWriter(false,true).write(invoiceItems);
	}

	public String getInvoiceItems() {
		return this.invoiceItems;
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

	public void setNormalInvoiceCode(String normalInvoiceCode) {
		this.normalInvoiceCode = normalInvoiceCode;
	}

	public String getNormalInvoiceCode() {
		return this.normalInvoiceCode;
	}

	public void setNormalInvoiceNo(String normalInvoiceNo) {
		this.normalInvoiceNo = normalInvoiceNo;
	}

	public String getNormalInvoiceNo() {
		return this.normalInvoiceNo;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
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
		return "alibaba.electronic.invoice.detail.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("anti_fake_code", this.antiFakeCode);
		txtParams.put("electronic_invoice_no", this.electronicInvoiceNo);
		txtParams.put("invoice_amount", this.invoiceAmount);
		txtParams.put("invoice_code", this.invoiceCode);
		txtParams.put("invoice_items", this.invoiceItems);
		txtParams.put("invoice_no", this.invoiceNo);
		txtParams.put("invoice_time", this.invoiceTime);
		txtParams.put("invoice_title", this.invoiceTitle);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("normal_invoice_code", this.normalInvoiceCode);
		txtParams.put("normal_invoice_no", this.normalInvoiceNo);
		txtParams.put("payee_name", this.payeeName);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("qr_code", this.qrCode);
		txtParams.put("serial_no", this.serialNo);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaElectronicInvoiceDetailUploadResponse> getResponseClass() {
		return AlibabaElectronicInvoiceDetailUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(electronicInvoiceNo, "electronicInvoiceNo");
		RequestCheckUtils.checkNotEmpty(invoiceAmount, "invoiceAmount");
		RequestCheckUtils.checkNotEmpty(invoiceCode, "invoiceCode");
		RequestCheckUtils.checkNotEmpty(invoiceFileData, "invoiceFileData");
		RequestCheckUtils.checkObjectMaxListSize(invoiceItems, 50, "invoiceItems");
		RequestCheckUtils.checkNotEmpty(invoiceNo, "invoiceNo");
		RequestCheckUtils.checkNotEmpty(invoiceTime, "invoiceTime");
		RequestCheckUtils.checkNotEmpty(invoiceTitle, "invoiceTitle");
		RequestCheckUtils.checkNotEmpty(invoiceType, "invoiceType");
		RequestCheckUtils.checkMaxValue(invoiceType, 2L, "invoiceType");
		RequestCheckUtils.checkMinValue(invoiceType, 1L, "invoiceType");
		RequestCheckUtils.checkNotEmpty(payeeName, "payeeName");
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("invoice_file_data", this.invoiceFileData);
		return params;
	}
	
		/**
 * {}
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InvoiceItem extends TaobaoObject {

	private static final long serialVersionUID = 1773448443171752749L;

	/**
		 * 价税合计。(等于sumPrice和tax之和)
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 发票项目名称（或商品名称）
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 发票项目编号（或商品编号）
		 */
		@ApiField("item_no")
		private String itemNo;
		/**
		 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
		 */
		@ApiField("price")
		private String price;
		/**
		 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
		 */
		@ApiField("row_type")
		private String rowType;
		/**
		 * 规格型号,可选
		 */
		@ApiField("specification")
		private String specification;
		/**
		 * 总价，格式：100.00
		 */
		@ApiField("sum_price")
		private String sumPrice;
		/**
		 * 税额
		 */
		@ApiField("tax")
		private String tax;
		/**
		 * 税率。税率只能为0或0.03或0.04或0.06或0.11或0.13或0.17
		 */
		@ApiField("tax_rate")
		private String taxRate;
		/**
		 * 单位。新版电子发票，折扣行不能传，非折扣行必传
		 */
		@ApiField("unit")
		private String unit;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemNo() {
			return this.itemNo;
		}
		public void setItemNo(String itemNo) {
			this.itemNo = itemNo;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getRowType() {
			return this.rowType;
		}
		public void setRowType(String rowType) {
			this.rowType = rowType;
		}
		public String getSpecification() {
			return this.specification;
		}
		public void setSpecification(String specification) {
			this.specification = specification;
		}
		public String getSumPrice() {
			return this.sumPrice;
		}
		public void setSumPrice(String sumPrice) {
			this.sumPrice = sumPrice;
		}
		public String getTax() {
			return this.tax;
		}
		public void setTax(String tax) {
			this.tax = tax;
		}
		public String getTaxRate() {
			return this.taxRate;
		}
		public void setTaxRate(String taxRate) {
			this.taxRate = taxRate;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}

}



}
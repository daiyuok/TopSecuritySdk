package com.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlibabaProviderEinvoiceCreateResponse;

/**
 * TOP API: alibaba.provider.einvoice.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.15
 */
public class AlibabaProviderEinvoiceCreateRequest extends BaseTaobaoRequest<AlibabaProviderEinvoiceCreateResponse> {
	
	

	/** 
	* 业务签名，用ca私钥做的业务签名
	 */
	private String bizSign;

	/** 
	* 默认：0。对于商家对个人开具，为0;对于商家对企业开具，为1
	 */
	private Long businessType;

	/** 
	* ERP系统中的单据号。如果没有erp的唯一单据号。建议使用platform_code+”_”+ platform_tid的组合方式
	 */
	private String erpTid;

	/** 
	* 开票金额(对应新版的价税合计,价税合计=合计金额+合计税额)
	 */
	private String invoiceAmount;

	/** 
	* 电子发票明细
	 */
	private String invoiceItems;

	/** 
	* 发票备注，有些省市会把此信息打印到PDF中
	 */
	private String invoiceMemo;

	/** 
	* 开票日期, 格式"YYYY-MM-DD HH:SS:MM"
	 */
	private Date invoiceTime;

	/** 
	* 发票(开票)类型，蓝票blue,红票red，默认blue
	 */
	private String invoiceType;

	/** 
	* 原发票代码(开红票时传入)
	 */
	private String normalInvoiceCode;

	/** 
	* 原发票号码(开红票时传入)
	 */
	private String normalInvoiceNo;

	/** 
	* 开票方地址(新版中为必传)
	 */
	private String payeeAddress;

	/** 
	* 开票方银行及 帐号
	 */
	private String payeeBankaccount;

	/** 
	* 复核人
	 */
	private String payeeChecker;

	/** 
	* 开票方名称，公司名(如:XX商城)
	 */
	private String payeeName;

	/** 
	* 开票人
	 */
	private String payeeOperator;

	/** 
	* 开票方 电话(新版中为必传)
	 */
	private String payeePhone;

	/** 
	* 收款人
	 */
	private String payeeReceiver;

	/** 
	* 收款方税务登记证号
	 */
	private String payeeRegisterNo;

	/** 
	* 消费者地址，开具增值税专用发票时必填，其他发票可以为空
	 */
	private String payerAddress;

	/** 
	* 付款方开票开户银行及账号
	 */
	private String payerBankaccount;

	/** 
	* 消费者电子邮箱
	 */
	private String payerEmail;

	/** 
	* 付款方名称, 对应发票台头
	 */
	private String payerName;

	/** 
	* 消费者联系电话，开具增值税专用发票时必填，其他发票可以为空。
	 */
	private String payerPhone;

	/** 
	* 付款方税务登记证号。
	 */
	private String payerRegisterNo;

	/** 
	* 电商平台代码。TB=淘宝 、TM=天猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ网购、AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1号店、VANCL=凡客、YL=邮乐、YG=优购、1688=阿里巴巴、POS=POS门店、OTHER=其他,  (只传英文编码)
	 */
	private String platformCode;

	/** 
	* 电商平台对应的订单号
	 */
	private String platformTid;

	/** 
	* 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求。
	 */
	private String serialNo;

	/** 
	* 合计金额(新版中为必传)
	 */
	private String sumPrice;

	/** 
	* 合计税额(新版中为必传)
	 */
	private String sumTax;

	public void setBizSign(String bizSign) {
		this.bizSign = bizSign;
	}

	public String getBizSign() {
		return this.bizSign;
	}

	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public Long getBusinessType() {
		return this.businessType;
	}

	public void setErpTid(String erpTid) {
		this.erpTid = erpTid;
	}

	public String getErpTid() {
		return this.erpTid;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
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

	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}

	public void setInvoiceTime(Date invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public Date getInvoiceTime() {
		return this.invoiceTime;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceType() {
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

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}

	public void setPayeeBankaccount(String payeeBankaccount) {
		this.payeeBankaccount = payeeBankaccount;
	}

	public String getPayeeBankaccount() {
		return this.payeeBankaccount;
	}

	public void setPayeeChecker(String payeeChecker) {
		this.payeeChecker = payeeChecker;
	}

	public String getPayeeChecker() {
		return this.payeeChecker;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeOperator(String payeeOperator) {
		this.payeeOperator = payeeOperator;
	}

	public String getPayeeOperator() {
		return this.payeeOperator;
	}

	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}

	public String getPayeePhone() {
		return this.payeePhone;
	}

	public void setPayeeReceiver(String payeeReceiver) {
		this.payeeReceiver = payeeReceiver;
	}

	public String getPayeeReceiver() {
		return this.payeeReceiver;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerAddress() {
		return this.payerAddress;
	}

	public void setPayerBankaccount(String payerBankaccount) {
		this.payerBankaccount = payerBankaccount;
	}

	public String getPayerBankaccount() {
		return this.payerBankaccount;
	}

	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
	}

	public String getPayerEmail() {
		return this.payerEmail;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}

	public String getPayerPhone() {
		return this.payerPhone;
	}

	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}

	public String getSumPrice() {
		return this.sumPrice;
	}

	public void setSumTax(String sumTax) {
		this.sumTax = sumTax;
	}

	public String getSumTax() {
		return this.sumTax;
	}

	public String getApiMethodName() {
		return "alibaba.provider.einvoice.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_sign", this.bizSign);
		txtParams.put("business_type", this.businessType);
		txtParams.put("erp_tid", this.erpTid);
		txtParams.put("invoice_amount", this.invoiceAmount);
		txtParams.put("invoice_items", this.invoiceItems);
		txtParams.put("invoice_memo", this.invoiceMemo);
		txtParams.put("invoice_time", this.invoiceTime);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("normal_invoice_code", this.normalInvoiceCode);
		txtParams.put("normal_invoice_no", this.normalInvoiceNo);
		txtParams.put("payee_address", this.payeeAddress);
		txtParams.put("payee_bankaccount", this.payeeBankaccount);
		txtParams.put("payee_checker", this.payeeChecker);
		txtParams.put("payee_name", this.payeeName);
		txtParams.put("payee_operator", this.payeeOperator);
		txtParams.put("payee_phone", this.payeePhone);
		txtParams.put("payee_receiver", this.payeeReceiver);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("payer_address", this.payerAddress);
		txtParams.put("payer_bankaccount", this.payerBankaccount);
		txtParams.put("payer_email", this.payerEmail);
		txtParams.put("payer_name", this.payerName);
		txtParams.put("payer_phone", this.payerPhone);
		txtParams.put("payer_register_no", this.payerRegisterNo);
		txtParams.put("platform_code", this.platformCode);
		txtParams.put("platform_tid", this.platformTid);
		txtParams.put("serial_no", this.serialNo);
		txtParams.put("sum_price", this.sumPrice);
		txtParams.put("sum_tax", this.sumTax);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaProviderEinvoiceCreateResponse> getResponseClass() {
		return AlibabaProviderEinvoiceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(businessType, "businessType");
		RequestCheckUtils.checkMaxValue(businessType, 1L, "businessType");
		RequestCheckUtils.checkMinValue(businessType, 0L, "businessType");
		RequestCheckUtils.checkNotEmpty(invoiceAmount, "invoiceAmount");
		RequestCheckUtils.checkMaxLength(invoiceAmount, 20, "invoiceAmount");
		RequestCheckUtils.checkObjectMaxListSize(invoiceItems, 100, "invoiceItems");
		RequestCheckUtils.checkMaxLength(invoiceMemo, 200, "invoiceMemo");
		RequestCheckUtils.checkNotEmpty(invoiceTime, "invoiceTime");
		RequestCheckUtils.checkNotEmpty(invoiceType, "invoiceType");
		RequestCheckUtils.checkMaxLength(normalInvoiceCode, 12, "normalInvoiceCode");
		RequestCheckUtils.checkMaxLength(normalInvoiceNo, 8, "normalInvoiceNo");
		RequestCheckUtils.checkNotEmpty(payeeAddress, "payeeAddress");
		RequestCheckUtils.checkMaxLength(payeeAddress, 100, "payeeAddress");
		RequestCheckUtils.checkMaxLength(payeeBankaccount, 100, "payeeBankaccount");
		RequestCheckUtils.checkMaxLength(payeeChecker, 8, "payeeChecker");
		RequestCheckUtils.checkNotEmpty(payeeName, "payeeName");
		RequestCheckUtils.checkMaxLength(payeeName, 100, "payeeName");
		RequestCheckUtils.checkNotEmpty(payeeOperator, "payeeOperator");
		RequestCheckUtils.checkMaxLength(payeeOperator, 8, "payeeOperator");
		RequestCheckUtils.checkNotEmpty(payeePhone, "payeePhone");
		RequestCheckUtils.checkMaxLength(payeePhone, 20, "payeePhone");
		RequestCheckUtils.checkMaxLength(payeeReceiver, 8, "payeeReceiver");
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
		RequestCheckUtils.checkMaxLength(payeeRegisterNo, 20, "payeeRegisterNo");
		RequestCheckUtils.checkMaxLength(payerAddress, 100, "payerAddress");
		RequestCheckUtils.checkMaxLength(payerBankaccount, 100, "payerBankaccount");
		RequestCheckUtils.checkNotEmpty(payerName, "payerName");
		RequestCheckUtils.checkMaxLength(payerName, 100, "payerName");
		RequestCheckUtils.checkMaxLength(payerPhone, 20, "payerPhone");
		RequestCheckUtils.checkMaxLength(payerRegisterNo, 20, "payerRegisterNo");
		RequestCheckUtils.checkNotEmpty(platformCode, "platformCode");
		RequestCheckUtils.checkNotEmpty(platformTid, "platformTid");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
		RequestCheckUtils.checkMaxLength(serialNo, 20, "serialNo");
		RequestCheckUtils.checkNotEmpty(sumPrice, "sumPrice");
		RequestCheckUtils.checkNotEmpty(sumTax, "sumTax");
	}
	
	/**
 * 电子发票明细
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InvoiceItem extends TaobaoObject {

	private static final long serialVersionUID = 5161464755723759182L;

	/**
		 * 价税合计。(等于sumPrice和tax之和)
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 商品IMIE号(不用传，将废弃)
		 */
		@ApiField("imei")
		private String imei;
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
		 * 规格型号。新版电子发票，折扣行此参数不能传，非折扣行必传
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
		 * 单位。新版电子发票，折扣行此参数不能传，非折扣行必传
		 */
		@ApiField("unit")
		private String unit;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getImei() {
			return this.imei;
		}
		public void setImei(String imei) {
			this.imei = imei;
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
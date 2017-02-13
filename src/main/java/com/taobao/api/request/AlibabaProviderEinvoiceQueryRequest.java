package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaProviderEinvoiceQueryResponse;

/**
 * TOP API: alibaba.provider.einvoice.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.09
 */
public class AlibabaProviderEinvoiceQueryRequest extends BaseTaobaoRequest<AlibabaProviderEinvoiceQueryResponse> {
	
	

	/** 
	* 收款方税务登记证号
	 */
	private String payeeRegisterNo;

	/** 
	* 电商平台代码。TB=淘宝 、TM=天猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ网购、AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1号店、VANCL=凡客、YL=邮乐、YG=优购、1688=阿里巴巴、POS=POS门店、OTHER=其他,  (只传英文编码)
	 */
	private String platformCode;

	/** 
	* 电商平台对应的订单号
	 */
	private String platformTid;

	/** 
	* 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求。与erp_tid二选一
	 */
	private String serialNo;

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
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

	public String getApiMethodName() {
		return "alibaba.provider.einvoice.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("platform_code", this.platformCode);
		txtParams.put("platform_tid", this.platformTid);
		txtParams.put("serial_no", this.serialNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaProviderEinvoiceQueryResponse> getResponseClass() {
		return AlibabaProviderEinvoiceQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
	}
	

}
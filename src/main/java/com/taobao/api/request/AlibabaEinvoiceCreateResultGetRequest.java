package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceCreateResultGetResponse;

/**
 * TOP API: alibaba.einvoice.create.result.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.31
 */
public class AlibabaEinvoiceCreateResultGetRequest extends BaseTaobaoRequest<AlibabaEinvoiceCreateResultGetResponse> {
	
	

	/** 
	* 收款方税务登记证号
	 */
	private String payeeRegisterNo;

	/** 
	* 电商平台代码。淘宝：taobao，天猫：tmall
	 */
	private String platformCode;

	/** 
	* 电商平台对应的订单号
	 */
	private String platformTid;

	/** 
	* 流水号 (serial_no)和(platform_code,platform_tid)必须填写其中一组,serial_no优先级更高
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
		return "alibaba.einvoice.create.result.get";
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

	public Class<AlibabaEinvoiceCreateResultGetResponse> getResponseClass() {
		return AlibabaEinvoiceCreateResultGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
	}
	

}
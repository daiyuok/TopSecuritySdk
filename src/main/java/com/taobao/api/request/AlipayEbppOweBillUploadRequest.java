package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayEbppOweBillUploadResponse;

/**
 * TOP API: alipay.ebpp.owe.bill.upload request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayEbppOweBillUploadRequest extends BaseTaobaoRequest<AlipayEbppOweBillUploadResponse> implements TaobaoUploadRequest<AlipayEbppOweBillUploadResponse> {

	
	

	/** 
	* 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	private String chargeInst;

	/** 
	* 销账机构
	 */
	private String chargeoffInst;

	/** 
	* 文件摘要，算法SHA
	 */
	private String digestOweBill;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* 文件内容
	 */
	private FileItem oweBill;

	/** 
	* 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	private String subOrderType;

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}

	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}

	public void setDigestOweBill(String digestOweBill) {
		this.digestOweBill = digestOweBill;
	}

	public String getDigestOweBill() {
		return this.digestOweBill;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOweBill(FileItem oweBill) {
		this.oweBill = oweBill;
	}

	public FileItem getOweBill() {
		return this.oweBill;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

	public String getSubOrderType() {
		return this.subOrderType;
	}

	public String getApiMethodName() {
		return "alipay.ebpp.owe.bill.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("chargeoff_inst", this.chargeoffInst);
		txtParams.put("digest_owe_bill", this.digestOweBill);
		txtParams.put("order_type", this.orderType);
		txtParams.put("sub_order_type", this.subOrderType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayEbppOweBillUploadResponse> getResponseClass() {
		return AlipayEbppOweBillUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(chargeInst, "chargeInst");
		RequestCheckUtils.checkMaxLength(chargeInst, 80, "chargeInst");
		RequestCheckUtils.checkMaxLength(chargeoffInst, 30, "chargeoffInst");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkMaxLength(orderType, 10, "orderType");
		RequestCheckUtils.checkNotEmpty(oweBill, "oweBill");
		RequestCheckUtils.checkNotEmpty(subOrderType, "subOrderType");
		RequestCheckUtils.checkMaxLength(subOrderType, 10, "subOrderType");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("owe_bill", this.oweBill);
		return params;
	}
	
	

}
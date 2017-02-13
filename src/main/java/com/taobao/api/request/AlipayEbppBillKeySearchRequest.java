package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayEbppBillKeySearchResponse;

/**
 * TOP API: alipay.ebpp.bill.key.search request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayEbppBillKeySearchRequest extends BaseTaobaoRequest<AlipayEbppBillKeySearchResponse> {
	
	

	/** 
	* 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	private String chargeInst;

	/** 
	* 结束时间。与开始时间间隔在七天之内
	 */
	private String endTime;

	/** 
	* 需要返回的字段列表。bill_key:户号
	 */
	private String fields;

	/** 
	* 是否仅包含订阅数据
	 */
	private Boolean onlySubscribed;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* 开始时间，时间必须是今天范围之内。格式为yyyy-MM-dd HH:mm:ss，精确到天
	 */
	private String startTime;

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

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setOnlySubscribed(Boolean onlySubscribed) {
		this.onlySubscribed = onlySubscribed;
	}

	public Boolean getOnlySubscribed() {
		return this.onlySubscribed;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

	public String getSubOrderType() {
		return this.subOrderType;
	}

	public String getApiMethodName() {
		return "alipay.ebpp.bill.key.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("end_time", this.endTime);
		txtParams.put("fields", this.fields);
		txtParams.put("only_subscribed", this.onlySubscribed);
		txtParams.put("order_type", this.orderType);
		txtParams.put("start_time", this.startTime);
		txtParams.put("sub_order_type", this.subOrderType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayEbppBillKeySearchResponse> getResponseClass() {
		return AlipayEbppBillKeySearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chargeInst, "chargeInst");
		RequestCheckUtils.checkMaxLength(chargeInst, 80, "chargeInst");
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkMaxLength(orderType, 10, "orderType");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
		RequestCheckUtils.checkNotEmpty(subOrderType, "subOrderType");
		RequestCheckUtils.checkMaxLength(subOrderType, 10, "subOrderType");
	}
	

}
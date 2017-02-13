package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeShippingaddressUpdateResponse;

/**
 * TOP API: taobao.trade.shippingaddress.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.23
 */
public class TradeShippingaddressUpdateRequest extends BaseTaobaoRequest<TradeShippingaddressUpdateResponse> {
	
	

	/** 
	* 收货地址。最大长度为228个字节。
	 */
	private String receiverAddress;

	/** 
	* 城市。最大长度为32个字节。如：杭州
	 */
	private String receiverCity;

	/** 
	* 区/县。最大长度为32个字节。如：西湖区
	 */
	private String receiverDistrict;

	/** 
	* 移动电话。最大长度为11个字节。
	 */
	private String receiverMobile;

	/** 
	* 收货人全名。最大长度为50个字节。
	 */
	private String receiverName;

	/** 
	* 固定电话。最大长度为30个字节。
	 */
	private String receiverPhone;

	/** 
	* 省份。最大长度为32个字节。如：浙江
	 */
	private String receiverState;

	/** 
	* 邮政编码。必须由6个数字组成。
	 */
	private String receiverZip;

	/** 
	* 交易编号。
	 */
	private Long tid;

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.shippingaddress.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("receiver_address", this.receiverAddress);
		txtParams.put("receiver_city", this.receiverCity);
		txtParams.put("receiver_district", this.receiverDistrict);
		txtParams.put("receiver_mobile", this.receiverMobile);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("receiver_phone", this.receiverPhone);
		txtParams.put("receiver_state", this.receiverState);
		txtParams.put("receiver_zip", this.receiverZip);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeShippingaddressUpdateResponse> getResponseClass() {
		return TradeShippingaddressUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(receiverAddress, 228, "receiverAddress");
		RequestCheckUtils.checkMaxLength(receiverCity, 32, "receiverCity");
		RequestCheckUtils.checkMaxLength(receiverDistrict, 32, "receiverDistrict");
		RequestCheckUtils.checkMaxLength(receiverMobile, 11, "receiverMobile");
		RequestCheckUtils.checkMaxLength(receiverName, 50, "receiverName");
		RequestCheckUtils.checkMaxLength(receiverPhone, 30, "receiverPhone");
		RequestCheckUtils.checkMaxLength(receiverState, 32, "receiverState");
		RequestCheckUtils.checkMaxLength(receiverZip, 6, "receiverZip");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
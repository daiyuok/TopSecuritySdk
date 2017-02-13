package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayMicropayOrderConfirmpayurlGetResponse;

/**
 * TOP API: alipay.micropay.order.confirmpayurl.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayMicropayOrderConfirmpayurlGetRequest extends BaseTaobaoRequest<AlipayMicropayOrderConfirmpayurlGetResponse> {
	
	

	/** 
	* 支付宝订单号，冻结流水号.这个是创建冻结订单支付宝返回的
	 */
	private String alipayOrderNo;

	/** 
	* 支付金额,区间必须在[0.01,30]，只能保留小数点后两位
	 */
	private String amount;

	/** 
	* 支付宝用户给应用的授权.
	 */
	private String authToken;

	/** 
	* 支付备注
	 */
	private String memo;

	/** 
	* 收款方的支付宝ID
	 */
	private String receiveUserId;

	/** 
	* 本次转账的外部单据号（只能由字母和数字组成,maxlength=32）
	 */
	private String transferOutOrderNo;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public String getReceiveUserId() {
		return this.receiveUserId;
	}

	public void setTransferOutOrderNo(String transferOutOrderNo) {
		this.transferOutOrderNo = transferOutOrderNo;
	}

	public String getTransferOutOrderNo() {
		return this.transferOutOrderNo;
	}

	public String getApiMethodName() {
		return "alipay.micropay.order.confirmpayurl.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alipay_order_no", this.alipayOrderNo);
		txtParams.put("amount", this.amount);
		txtParams.put("auth_token", this.authToken);
		txtParams.put("memo", this.memo);
		txtParams.put("receive_user_id", this.receiveUserId);
		txtParams.put("transfer_out_order_no", this.transferOutOrderNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayMicropayOrderConfirmpayurlGetResponse> getResponseClass() {
		return AlipayMicropayOrderConfirmpayurlGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(alipayOrderNo, "alipayOrderNo");
		RequestCheckUtils.checkNotEmpty(amount, "amount");
		RequestCheckUtils.checkNotEmpty(memo, "memo");
		RequestCheckUtils.checkNotEmpty(receiveUserId, "receiveUserId");
		RequestCheckUtils.checkNotEmpty(transferOutOrderNo, "transferOutOrderNo");
	}
	

}
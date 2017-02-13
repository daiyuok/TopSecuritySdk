package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayUserContractGetResponse;

/**
 * TOP API: alipay.user.contract.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayUserContractGetRequest extends BaseTaobaoRequest<AlipayUserContractGetResponse> {
	
	

	/** 
	* 订购者支付宝ID。session与subscriber_user_id二选一即可。
	 */
	private String subscriberUserId;

	public void setSubscriberUserId(String subscriberUserId) {
		this.subscriberUserId = subscriberUserId;
	}

	public String getSubscriberUserId() {
		return this.subscriberUserId;
	}

	public String getApiMethodName() {
		return "alipay.user.contract.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("subscriber_user_id", this.subscriberUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayUserContractGetResponse> getResponseClass() {
		return AlipayUserContractGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
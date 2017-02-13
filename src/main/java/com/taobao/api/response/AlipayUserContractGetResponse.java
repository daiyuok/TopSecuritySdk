package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AlipayContract;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.user.contract.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayUserContractGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7126222297299299429L;

	/** 
	 * 支付宝用户订购信息
	 */
	@ApiField("alipay_contract")
	private AlipayContract alipayContract;


	public void setAlipayContract(AlipayContract alipayContract) {
		this.alipayContract = alipayContract;
	}
	public AlipayContract getAlipayContract( ) {
		return this.alipayContract;
	}
	


}

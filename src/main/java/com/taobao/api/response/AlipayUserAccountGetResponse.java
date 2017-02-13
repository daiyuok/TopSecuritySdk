package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AlipayAccount;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.user.account.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayUserAccountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2529697427688458943L;

	/** 
	 * 支付宝用户账户信息
	 */
	@ApiField("alipay_account")
	private AlipayAccount alipayAccount;


	public void setAlipayAccount(AlipayAccount alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public AlipayAccount getAlipayAccount( ) {
		return this.alipayAccount;
	}
	


}

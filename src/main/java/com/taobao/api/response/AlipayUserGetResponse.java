package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AlipayUserDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3273972155558556524L;

	/** 
	 * 支付宝用户信息
	 */
	@ApiField("alipay_user_detail")
	private AlipayUserDetail alipayUserDetail;


	public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail) {
		this.alipayUserDetail = alipayUserDetail;
	}
	public AlipayUserDetail getAlipayUserDetail( ) {
		return this.alipayUserDetail;
	}
	


}

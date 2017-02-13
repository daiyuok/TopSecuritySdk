package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SinglePayDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.micropay.order.confirmpayurl.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayMicropayOrderConfirmpayurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2736158738799889396L;

	/** 
	 * SinglePayDetail信息
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;


	public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}
	public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}
	


}

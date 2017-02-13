package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ImprFeedIdDO;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderate.impr.imprword.byfeedid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateImprImprwordByfeedidGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3641813447656984181L;

	/** 
	 * 根据子订单和买家昵称找到的评价和印象词结果
	 */
	@ApiField("impr_feed")
	private ImprFeedIdDO imprFeed;


	public void setImprFeed(ImprFeedIdDO imprFeed) {
		this.imprFeed = imprFeed;
	}
	public ImprFeedIdDO getImprFeed( ) {
		return this.imprFeed;
	}
	


}

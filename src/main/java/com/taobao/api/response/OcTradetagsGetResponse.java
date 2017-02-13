package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeTagRelationDo;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.oc.tradetags.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcTradetagsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8397833636191198547L;

	/** 
	 * 返回结果
	 */
	@ApiListField("trade_tags")
	@ApiField("trade_tag_relation_do")
	private List<TradeTagRelationDo> tradeTags;


	public void setTradeTags(List<TradeTagRelationDo> tradeTags) {
		this.tradeTags = tradeTags;
	}
	public List<TradeTagRelationDo> getTradeTags( ) {
		return this.tradeTags;
	}
	


}

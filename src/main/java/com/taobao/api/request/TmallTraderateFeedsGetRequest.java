package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallTraderateFeedsGetResponse;

/**
 * TOP API: tmall.traderate.feeds.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.30
 */
public class TmallTraderateFeedsGetRequest extends BaseTaobaoRequest<TmallTraderateFeedsGetResponse> {
	
	

	/** 
	* 交易子订单ID
	 */
	private Long childTradeId;

	public void setChildTradeId(Long childTradeId) {
		this.childTradeId = childTradeId;
	}

	public Long getChildTradeId() {
		return this.childTradeId;
	}

	public String getApiMethodName() {
		return "tmall.traderate.feeds.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_trade_id", this.childTradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallTraderateFeedsGetResponse> getResponseClass() {
		return TmallTraderateFeedsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(childTradeId, "childTradeId");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TraderateImprImprwordByfeedidGetResponse;

/**
 * TOP API: taobao.traderate.impr.imprword.byfeedid.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TraderateImprImprwordByfeedidGetRequest extends BaseTaobaoRequest<TraderateImprImprwordByfeedidGetResponse> {
	
	

	/** 
	* 交易订单id号（如果包含子订单，请使用子订单id号）
	 */
	private Long childTradeId;

	public void setChildTradeId(Long childTradeId) {
		this.childTradeId = childTradeId;
	}

	public Long getChildTradeId() {
		return this.childTradeId;
	}

	public String getApiMethodName() {
		return "taobao.traderate.impr.imprword.byfeedid.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_trade_id", this.childTradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TraderateImprImprwordByfeedidGetResponse> getResponseClass() {
		return TraderateImprImprwordByfeedidGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(childTradeId, "childTradeId");
	}
	

}
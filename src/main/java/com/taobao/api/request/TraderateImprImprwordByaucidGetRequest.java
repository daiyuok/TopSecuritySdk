package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TraderateImprImprwordByaucidGetResponse;

/**
 * TOP API: taobao.traderate.impr.imprword.byaucid.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TraderateImprImprwordByaucidGetRequest extends BaseTaobaoRequest<TraderateImprImprwordByaucidGetResponse> {
	
	

	/** 
	* 淘宝的商品id
	 */
	private Long auctionId;

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public Long getAuctionId() {
		return this.auctionId;
	}

	public String getApiMethodName() {
		return "taobao.traderate.impr.imprword.byaucid.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auction_id", this.auctionId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TraderateImprImprwordByaucidGetResponse> getResponseClass() {
		return TraderateImprImprwordByaucidGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.UmpPromotionGetResponse;

/**
 * TOP API: taobao.ump.promotion.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.13
 */
public class UmpPromotionGetRequest extends BaseTaobaoRequest<UmpPromotionGetResponse> {
	
	

	/** 
	* 渠道来源，第三方站点
	 */
	private String channelKey;

	/** 
	* 商品id
	 */
	private Long itemId;

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public String getChannelKey() {
		return this.channelKey;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.ump.promotion.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_key", this.channelKey);
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UmpPromotionGetResponse> getResponseClass() {
		return UmpPromotionGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallTraderateItemtagsGetResponse;

/**
 * TOP API: tmall.traderate.itemtags.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.20
 */
public class TmallTraderateItemtagsGetRequest extends BaseTaobaoRequest<TmallTraderateItemtagsGetResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "tmall.traderate.itemtags.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallTraderateItemtagsGetResponse> getResponseClass() {
		return TmallTraderateItemtagsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}
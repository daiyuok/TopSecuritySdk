package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.QimenItemsTagQueryResponse;

/**
 * TOP API: taobao.qimen.items.tag.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.04
 */
public class QimenItemsTagQueryRequest extends BaseTaobaoRequest<QimenItemsTagQueryResponse> {
	
	

	/** 
	* 线上淘宝商品ID，long，必填
	 */
	private String itemIds;

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public String getApiMethodName() {
		return "taobao.qimen.items.tag.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_ids", this.itemIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenItemsTagQueryResponse> getResponseClass() {
		return QimenItemsTagQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
		RequestCheckUtils.checkMaxListSize(itemIds, 20, "itemIds");
	}
	

}
package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.quantity.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemQuantityUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1588464281583436222L;

	/** 
	 * iid、numIid、num和modified，skus中每个sku的skuId、quantity和modified
	 */
	@ApiField("item")
	private Item item;


	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}
	


}

package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemListWlbWmsInventoryLackUpload extends TaobaoObject {

	private static final long serialVersionUID = 2322112728846428188L;

	/**
	 * 后端商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 应发商品数量
	 */
	@ApiField("item_qty")
	private Long itemQty;

	/**
	 * 商品缺货数量
	 */
	@ApiField("lack_qty")
	private Long lackQty;

	/**
	 * 报缺原因（系统报缺，实物报缺）
	 */
	@ApiField("reason")
	private String reason;


	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getItemQty() {
		return this.itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public Long getLackQty() {
		return this.lackQty;
	}
	public void setLackQty(Long lackQty) {
		this.lackQty = lackQty;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}

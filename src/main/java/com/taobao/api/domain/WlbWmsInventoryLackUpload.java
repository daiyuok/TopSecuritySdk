package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 缺货通知信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryLackUpload extends TaobaoObject {

	private static final long serialVersionUID = 3444853332455136243L;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 商品信息列表
	 */
	@ApiListField("item_list")
	@ApiField("item_list_wlb_wms_inventory_lack_upload")
	private List<ItemListWlbWmsInventoryLackUpload> itemList;

	/**
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 外部业务编码;消息ID，用于去重
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 仓储订单编码
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;

	/**
	 * 仓库编码
	 */
	@ApiField("strore_code")
	private String stroreCode;


	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<ItemListWlbWmsInventoryLackUpload> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemListWlbWmsInventoryLackUpload> itemList) {
		this.itemList = itemList;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreOrderCode() {
		return this.storeOrderCode;
	}
	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}

	public String getStroreCode() {
		return this.stroreCode;
	}
	public void setStroreCode(String stroreCode) {
		this.stroreCode = stroreCode;
	}

}

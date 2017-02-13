package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockOutOrderConfirmResponse;

/**
 * TOP API: taobao.wlb.wms.stock.out.order.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.07
 */
public class WlbWmsStockOutOrderConfirmRequest extends BaseTaobaoRequest<WlbWmsStockOutOrderConfirmResponse> {
	
	

	/** 
	* 出库订单确认信息
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsStockOutOrderConfirm content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.stock.out.order.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsStockOutOrderConfirmResponse> getResponseClass() {
		return WlbWmsStockOutOrderConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ItemsWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 3456636382729777484L;

	/**
		 * 批次号
		 */
		@ApiField("batch_code")
		private String batchCode;
		/**
		 * 失效日期
		 */
		@ApiField("due_date")
		private String dueDate;
		/**
		 * 库存类型 1 可销售库存  101 类型用来定义残次品  201  冻结类型库存 301 在途库存
		 */
		@ApiField("inventory_type")
		private Long inventoryType;
		/**
		 * 生产批号
		 */
		@ApiField("produce_code")
		private String produceCode;
		/**
		 * 生产日期
		 */
		@ApiField("produce_date")
		private String produceDate;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
	

	public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getDueDate() {
			return this.dueDate;
		}
		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}
		public Long getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(Long inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProduceDate() {
			return this.produceDate;
		}
		public void setProduceDate(String produceDate) {
			this.produceDate = produceDate;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

}

	/**
 * 订单商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderItemsWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 5649145582527928823L;

	/**
		 * 是否完成
		 */
		@ApiField("is_completed")
		private Boolean isCompleted;
		/**
		 * 商品码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 系统自动生成
		 */
		@ApiListField("items")
		@ApiField("items_wlb_wms_stock_out_order_confirm")
		private List<ItemsWlbWmsStockOutOrderConfirm> items;
		/**
		 * ERP订单明细行号ID
		 */
		@ApiField("order_item_id")
		private String orderItemId;
	

	public Boolean getIsCompleted() {
			return this.isCompleted;
		}
		public void setIsCompleted(Boolean isCompleted) {
			this.isCompleted = isCompleted;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public List<ItemsWlbWmsStockOutOrderConfirm> getItems() {
			return this.items;
		}
		public void setItems(List<ItemsWlbWmsStockOutOrderConfirm> items) {
			this.items = items;
		}
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}

}

	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageItemItemsWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 7886485326317655746L;

	/**
		 * 后端商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 此包裹里该商品的数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
	

	public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public Long getItemQuantity() {
			return this.itemQuantity;
		}
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

}

	/**
 * 包裹信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageInfosWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 6612153813759518761L;

	/**
		 * 包裹编号
		 */
		@ApiField("package_code")
		private String packageCode;
		/**
		 * 包裹高度，单位：毫米
		 */
		@ApiField("package_height")
		private Long packageHeight;
		/**
		 * 系统自动生成
		 */
		@ApiListField("package_item_items")
		@ApiField("package_item_items_wlb_wms_stock_out_order_confirm")
		private List<PackageItemItemsWlbWmsStockOutOrderConfirm> packageItemItems;
		/**
		 * 包裹长度，单位：毫米
		 */
		@ApiField("package_length")
		private Long packageLength;
		/**
		 * 包裹重量，单位：克
		 */
		@ApiField("package_weight")
		private Long packageWeight;
		/**
		 * 包裹宽度，单位：毫米
		 */
		@ApiField("package_width")
		private Long packageWidth;
		/**
		 * 快递公司编码
		 */
		@ApiField("tms_code")
		private String tmsCode;
		/**
		 * 运单号
		 */
		@ApiField("tms_order_code")
		private String tmsOrderCode;
	

	public String getPackageCode() {
			return this.packageCode;
		}
		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}
		public Long getPackageHeight() {
			return this.packageHeight;
		}
		public void setPackageHeight(Long packageHeight) {
			this.packageHeight = packageHeight;
		}
		public List<PackageItemItemsWlbWmsStockOutOrderConfirm> getPackageItemItems() {
			return this.packageItemItems;
		}
		public void setPackageItemItems(List<PackageItemItemsWlbWmsStockOutOrderConfirm> packageItemItems) {
			this.packageItemItems = packageItemItems;
		}
		public Long getPackageLength() {
			return this.packageLength;
		}
		public void setPackageLength(Long packageLength) {
			this.packageLength = packageLength;
		}
		public Long getPackageWeight() {
			return this.packageWeight;
		}
		public void setPackageWeight(Long packageWeight) {
			this.packageWeight = packageWeight;
		}
		public Long getPackageWidth() {
			return this.packageWidth;
		}
		public void setPackageWidth(Long packageWidth) {
			this.packageWidth = packageWidth;
		}
		public String getTmsCode() {
			return this.tmsCode;
		}
		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}
		public String getTmsOrderCode() {
			return this.tmsOrderCode;
		}
		public void setTmsOrderCode(String tmsOrderCode) {
			this.tmsOrderCode = tmsOrderCode;
		}

}

	/**
 * 出库订单确认信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 7387212418636122196L;

	/**
		 * 运输公司名称
		 */
		@ApiField("carriers_name")
		private String carriersName;
		/**
		 * 支持出入库单多次确认 0 最后一次确认或是一次性确认；1 多次确认；当多次确认时，确认的ITEM种类全部被确认时，确认完成默  认值为 0 例如输入2认为是0
		 */
		@ApiField("confirm_type")
		private Long confirmType;
		/**
		 * 仓库订单编码
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 订单出库时间
		 */
		@ApiField("order_confirm_time")
		private String orderConfirmTime;
		/**
		 * 订单商品信息列表
		 */
		@ApiListField("order_items")
		@ApiField("order_items_wlb_wms_stock_out_order_confirm")
		private List<OrderItemsWlbWmsStockOutOrderConfirm> orderItems;
		/**
		 * 单据类型 301 调拨出库单、901普通出库单、903 其他出库单、305 B2B出库单
		 */
		@ApiField("order_type")
		private Long orderType;
		/**
		 * 外部业务编码
		 */
		@ApiField("out_biz_code")
		private String outBizCode;
		/**
		 * 包裹信息列表
		 */
		@ApiListField("package_infos")
		@ApiField("package_infos_wlb_wms_stock_out_order_confirm")
		private List<PackageInfosWlbWmsStockOutOrderConfirm> packageInfos;
		/**
		 * 仓配订单编码
		 */
		@ApiField("store_order_code")
		private String storeOrderCode;
		/**
		 * 运单号&托运单号
		 */
		@ApiField("tms_order_code")
		private String tmsOrderCode;
		/**
		 * 总包裹数
		 */
		@ApiField("total_package_qty")
		private Long totalPackageQty;
		/**
		 * 总体积，单位立方厘米
		 */
		@ApiField("total_package_volume")
		private Long totalPackageVolume;
		/**
		 * 总重量，单位克
		 */
		@ApiField("total_package_weight")
		private Long totalPackageWeight;
	

	public String getCarriersName() {
			return this.carriersName;
		}
		public void setCarriersName(String carriersName) {
			this.carriersName = carriersName;
		}
		public Long getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(Long confirmType) {
			this.confirmType = confirmType;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderConfirmTime() {
			return this.orderConfirmTime;
		}
		public void setOrderConfirmTime(String orderConfirmTime) {
			this.orderConfirmTime = orderConfirmTime;
		}
		public List<OrderItemsWlbWmsStockOutOrderConfirm> getOrderItems() {
			return this.orderItems;
		}
		public void setOrderItems(List<OrderItemsWlbWmsStockOutOrderConfirm> orderItems) {
			this.orderItems = orderItems;
		}
		public Long getOrderType() {
			return this.orderType;
		}
		public void setOrderType(Long orderType) {
			this.orderType = orderType;
		}
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public List<PackageInfosWlbWmsStockOutOrderConfirm> getPackageInfos() {
			return this.packageInfos;
		}
		public void setPackageInfos(List<PackageInfosWlbWmsStockOutOrderConfirm> packageInfos) {
			this.packageInfos = packageInfos;
		}
		public String getStoreOrderCode() {
			return this.storeOrderCode;
		}
		public void setStoreOrderCode(String storeOrderCode) {
			this.storeOrderCode = storeOrderCode;
		}
		public String getTmsOrderCode() {
			return this.tmsOrderCode;
		}
		public void setTmsOrderCode(String tmsOrderCode) {
			this.tmsOrderCode = tmsOrderCode;
		}
		public Long getTotalPackageQty() {
			return this.totalPackageQty;
		}
		public void setTotalPackageQty(Long totalPackageQty) {
			this.totalPackageQty = totalPackageQty;
		}
		public Long getTotalPackageVolume() {
			return this.totalPackageVolume;
		}
		public void setTotalPackageVolume(Long totalPackageVolume) {
			this.totalPackageVolume = totalPackageVolume;
		}
		public Long getTotalPackageWeight() {
			return this.totalPackageWeight;
		}
		public void setTotalPackageWeight(Long totalPackageWeight) {
			this.totalPackageWeight = totalPackageWeight;
		}

}


}
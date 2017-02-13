package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.logistics.intelli.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoLogisticsIntelliGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3658421582448688332L;

	/** 
	 * 智选物流返回结果类
	 */
	@ApiField("intelli_logistics_result")
	private IntelliLogisticsResult intelliLogisticsResult;


	public void setIntelliLogisticsResult(IntelliLogisticsResult intelliLogisticsResult) {
		this.intelliLogisticsResult = intelliLogisticsResult;
	}
	public IntelliLogisticsResult getIntelliLogisticsResult( ) {
		return this.intelliLogisticsResult;
	}
	
	/**
 * 智选物流返回结果类
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IntelliLogisticsResult extends TaobaoObject {

	private static final long serialVersionUID = 2313711379831655815L;

	/**
		 * 物流公司编码
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 物流公司id
		 */
		@ApiField("cp_id")
		private Long cpId;
		/**
		 * 物流公司名称
		 */
		@ApiField("cp_name")
		private String cpName;
		/**
		 * 发货地城市名称
		 */
		@ApiField("from_city")
		private String fromCity;
		/**
		 * 发货地的详细地址
		 */
		@ApiField("from_detail_address")
		private String fromDetailAddress;
		/**
		 * 发货地的区名称
		 */
		@ApiField("from_district")
		private String fromDistrict;
		/**
		 * 发货地省份名称
		 */
		@ApiField("from_prov")
		private String fromProv;
		/**
		 * 淘宝交易订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 商家id(主账号id)
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 到货地城市名称
		 */
		@ApiField("to_city")
		private String toCity;
		/**
		 * 到货地的详细地址
		 */
		@ApiField("to_detail_address")
		private String toDetailAddress;
		/**
		 * 到货地的区名称
		 */
		@ApiField("to_district")
		private String toDistrict;
		/**
		 * 到货地省份名称
		 */
		@ApiField("to_prov")
		private String toProv;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public Long getCpId() {
			return this.cpId;
		}
		public void setCpId(Long cpId) {
			this.cpId = cpId;
		}
		public String getCpName() {
			return this.cpName;
		}
		public void setCpName(String cpName) {
			this.cpName = cpName;
		}
		public String getFromCity() {
			return this.fromCity;
		}
		public void setFromCity(String fromCity) {
			this.fromCity = fromCity;
		}
		public String getFromDetailAddress() {
			return this.fromDetailAddress;
		}
		public void setFromDetailAddress(String fromDetailAddress) {
			this.fromDetailAddress = fromDetailAddress;
		}
		public String getFromDistrict() {
			return this.fromDistrict;
		}
		public void setFromDistrict(String fromDistrict) {
			this.fromDistrict = fromDistrict;
		}
		public String getFromProv() {
			return this.fromProv;
		}
		public void setFromProv(String fromProv) {
			this.fromProv = fromProv;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getToCity() {
			return this.toCity;
		}
		public void setToCity(String toCity) {
			this.toCity = toCity;
		}
		public String getToDetailAddress() {
			return this.toDetailAddress;
		}
		public void setToDetailAddress(String toDetailAddress) {
			this.toDetailAddress = toDetailAddress;
		}
		public String getToDistrict() {
			return this.toDistrict;
		}
		public void setToDistrict(String toDistrict) {
			this.toDistrict = toDistrict;
		}
		public String getToProv() {
			return this.toProv;
		}
		public void setToProv(String toProv) {
			this.toProv = toProv;
		}

}



}

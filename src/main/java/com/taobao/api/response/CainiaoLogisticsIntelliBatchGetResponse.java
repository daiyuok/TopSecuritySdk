package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.logistics.intelli.batch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoLogisticsIntelliBatchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6747886798225885371L;

	/** 
	 * 返回结果封装类
	 */
	@ApiListField("intelli_logistics_result_wraps")
	@ApiField("intelli_logistics_result_wrap")
	private List<IntelliLogisticsResultWrap> intelliLogisticsResultWraps;


	public void setIntelliLogisticsResultWraps(List<IntelliLogisticsResultWrap> intelliLogisticsResultWraps) {
		this.intelliLogisticsResultWraps = intelliLogisticsResultWraps;
	}
	public List<IntelliLogisticsResultWrap> getIntelliLogisticsResultWraps( ) {
		return this.intelliLogisticsResultWraps;
	}
	
	/**
 * 智选结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IntelliLogisticsResult extends TaobaoObject {

	private static final long serialVersionUID = 2128629559557561498L;

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
		 * 到货地址的区名称
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

	/**
 * 返回结果封装类
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IntelliLogisticsResultWrap extends TaobaoObject {

	private static final long serialVersionUID = 2457137192282613425L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 智选结果
		 */
		@ApiField("intelli_logistics_result")
		private IntelliLogisticsResult intelliLogisticsResult;
		/**
		 * 结果是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public IntelliLogisticsResult getIntelliLogisticsResult() {
			return this.intelliLogisticsResult;
		}
		public void setIntelliLogisticsResult(IntelliLogisticsResult intelliLogisticsResult) {
			this.intelliLogisticsResult = intelliLogisticsResult;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

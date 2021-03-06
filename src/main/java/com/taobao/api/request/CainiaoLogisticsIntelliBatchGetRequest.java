package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoLogisticsIntelliBatchGetResponse;

/**
 * TOP API: cainiao.logistics.intelli.batch.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.20
 */
public class CainiaoLogisticsIntelliBatchGetRequest extends BaseTaobaoRequest<CainiaoLogisticsIntelliBatchGetResponse> {
	
	

	/** 
	* 批量智选物流请求参数
	 */
	private String intelliLogisticsParams;

	public void setIntelliLogisticsParams(String intelliLogisticsParams) {
		this.intelliLogisticsParams = intelliLogisticsParams;
	}

	public void setIntelliLogisticsParams(List<IntelliLogisticsParam> intelliLogisticsParams) {
		this.intelliLogisticsParams = new JSONWriter(false,true).write(intelliLogisticsParams);
	}

	public String getIntelliLogisticsParams() {
		return this.intelliLogisticsParams;
	}

	public String getApiMethodName() {
		return "cainiao.logistics.intelli.batch.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("intelli_logistics_params", this.intelliLogisticsParams);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoLogisticsIntelliBatchGetResponse> getResponseClass() {
		return CainiaoLogisticsIntelliBatchGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(intelliLogisticsParams, 10, "intelliLogisticsParams");
	}
	
	/**
 * 批量智选物流请求参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IntelliLogisticsParam extends TaobaoObject {

	private static final long serialVersionUID = 6335761239383578319L;

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
		 * 淘宝交易订单id（为了更好效果，推荐填写）
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
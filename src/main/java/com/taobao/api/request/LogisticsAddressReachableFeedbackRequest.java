package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.LogisticsAddressReachableFeedbackResponse;

/**
 * TOP API: taobao.logistics.address.reachable.feedback request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.20
 */
public class LogisticsAddressReachableFeedbackRequest extends BaseTaobaoRequest<LogisticsAddressReachableFeedbackResponse> {
	
	

	/** 
	* 地址可达性反馈数据对象
	 */
	private String paramAddressReachableFeedbackTopRequest;

	public void setParamAddressReachableFeedbackTopRequest(String paramAddressReachableFeedbackTopRequest) {
		this.paramAddressReachableFeedbackTopRequest = paramAddressReachableFeedbackTopRequest;
	}

	public void setParamAddressReachableFeedbackTopRequest(AddressReachableFeedbackTopRequest paramAddressReachableFeedbackTopRequest) {
		this.paramAddressReachableFeedbackTopRequest = new JSONWriter(false,true).write(paramAddressReachableFeedbackTopRequest);
	}

	public String getParamAddressReachableFeedbackTopRequest() {
		return this.paramAddressReachableFeedbackTopRequest;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.reachable.feedback";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_address_reachable_feedback_top_request", this.paramAddressReachableFeedbackTopRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressReachableFeedbackResponse> getResponseClass() {
		return LogisticsAddressReachableFeedbackResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 地址可达性反馈数据对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressReachableFeedbackTopRequest extends TaobaoObject {

	private static final long serialVersionUID = 2336538859278636672L;

	/**
		 * 收货地址，请填写详细的收货地址，包括省、市、区、街道或镇
		 */
		@ApiField("address")
		private String address;
		/**
		 * 物流商编码code
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 物流商ID
		 */
		@ApiField("cp_id")
		private Long cpId;
		/**
		 * 地址是否可达：0-不可达；1-可达
		 */
		@ApiField("reachable")
		private Long reachable;
		/**
		 * 商家ID，淘宝卖家sellerId
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 商家昵称
		 */
		@ApiField("seller_nick_name")
		private String sellerNickName;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
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
		public Long getReachable() {
			return this.reachable;
		}
		public void setReachable(Long reachable) {
			this.reachable = reachable;
		}
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerNickName() {
			return this.sellerNickName;
		}
		public void setSellerNickName(String sellerNickName) {
			this.sellerNickName = sellerNickName;
		}

}


}
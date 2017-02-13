package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.reachablebatch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressReachablebatchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2747596463346955441L;

	/** 
	 * 物流是否可达结果列表
	 */
	@ApiListField("reachable_results")
	@ApiField("address_reachable_top_result")
	private List<AddressReachableTopResult> reachableResults;


	public void setReachableResults(List<AddressReachableTopResult> reachableResults) {
		this.reachableResults = reachableResults;
	}
	public List<AddressReachableTopResult> getReachableResults( ) {
		return this.reachableResults;
	}
	
	/**
 * 筛单结果l列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressReachableResult extends TaobaoObject {

	private static final long serialVersionUID = 7825717324136528965L;

	/**
		 * 区域编码
		 */
		@ApiField("division_id")
		private Long divisionId;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 物流公司代号
		 */
		@ApiField("partner_code")
		private String partnerCode;
		/**
		 * 物流公司编码ID
		 */
		@ApiField("partner_id")
		private Long partnerId;
		/**
		 * 物流公司名称
		 */
		@ApiField("partner_name")
		private String partnerName;
		/**
		 * 服务是否可达， 0 - 不可达 1 - 可达 2 - 不确定 3 - 未配置
		 */
		@ApiField("reachable")
		private String reachable;
		/**
		 * 服务对应的数字编码，如揽派范围对应88
		 */
		@ApiField("service_type")
		private String serviceType;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public Long getDivisionId() {
			return this.divisionId;
		}
		public void setDivisionId(Long divisionId) {
			this.divisionId = divisionId;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getPartnerCode() {
			return this.partnerCode;
		}
		public void setPartnerCode(String partnerCode) {
			this.partnerCode = partnerCode;
		}
		public Long getPartnerId() {
			return this.partnerId;
		}
		public void setPartnerId(Long partnerId) {
			this.partnerId = partnerId;
		}
		public String getPartnerName() {
			return this.partnerName;
		}
		public void setPartnerName(String partnerName) {
			this.partnerName = partnerName;
		}
		public String getReachable() {
			return this.reachable;
		}
		public void setReachable(String reachable) {
			this.reachable = reachable;
		}
		public String getServiceType() {
			return this.serviceType;
		}
		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}

	/**
 * 物流是否可达结果列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressReachableTopResult extends TaobaoObject {

	private static final long serialVersionUID = 4339647765235387979L;

	/**
		 * 筛单结果l列表
		 */
		@ApiListField("reachable_result_list")
		@ApiField("address_reachable_result")
		private List<AddressReachableResult> reachableResultList;
	

	public List<AddressReachableResult> getReachableResultList() {
			return this.reachableResultList;
		}
		public void setReachableResultList(List<AddressReachableResult> reachableResultList) {
			this.reachableResultList = reachableResultList;
		}

}



}

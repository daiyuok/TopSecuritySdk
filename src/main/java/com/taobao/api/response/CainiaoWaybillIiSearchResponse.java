package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4837214158829596652L;

	/** 
	 * CP网点信息及对应的商家的发货信息
	 */
	@ApiListField("waybill_apply_subscription_cols")
	@ApiField("waybill_apply_subscription_info")
	private List<WaybillApplySubscriptionInfo> waybillApplySubscriptionCols;


	public void setWaybillApplySubscriptionCols(List<WaybillApplySubscriptionInfo> waybillApplySubscriptionCols) {
		this.waybillApplySubscriptionCols = waybillApplySubscriptionCols;
	}
	public List<WaybillApplySubscriptionInfo> getWaybillApplySubscriptionCols( ) {
		return this.waybillApplySubscriptionCols;
	}
	
	/**
 * 当前网点下的发货地址
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressDto extends TaobaoObject {

	private static final long serialVersionUID = 5323767813216667821L;

	/**
		 * 市名称（二级地址）
		 */
		@ApiField("city")
		private String city;
		/**
		 * 详细地址
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 区名称（三级地址）
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省名称（一级地址）
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道\镇名称（四级地址）
		 */
		@ApiField("town")
		private String town;
	

	public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}

}

	/**
 * 可用的服务信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ServiceInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 5698939757492314118L;

	/**
		 * 服务编码
		 */
		@ApiField("service_code")
		private String serviceCode;
		/**
		 * 服务名称
		 */
		@ApiField("service_name")
		private String serviceName;
	

	public String getServiceCode() {
			return this.serviceCode;
		}
		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}
		public String getServiceName() {
			return this.serviceName;
		}
		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

}

	/**
 * CP网点信息及对应的商家的发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillBranchAccount extends TaobaoObject {

	private static final long serialVersionUID = 3667962552125375675L;

	/**
		 * 已用面单数量
		 */
		@ApiField("allocated_quantity")
		private Long allocatedQuantity;
		/**
		 * 网点Code
		 */
		@ApiField("branch_code")
		private String branchCode;
		/**
		 * 网点名称
		 */
		@ApiField("branch_name")
		private String branchName;
		/**
		 * 网点状态
		 */
		@ApiField("branch_status")
		private Long branchStatus;
		/**
		 * 取消的面单总数
		 */
		@ApiField("cancel_quantity")
		private Long cancelQuantity;
		/**
		 * 已经打印的面单总数
		 */
		@ApiField("print_quantity")
		private Long printQuantity;
		/**
		 * 电子面单余额数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 可用的服务信息列表
		 */
		@ApiListField("service_info_cols")
		@ApiField("service_info_dto")
		private List<ServiceInfoDto> serviceInfoCols;
		/**
		 * 当前网点下的发货地址
		 */
		@ApiListField("shipp_address_cols")
		@ApiField("address_dto")
		private List<AddressDto> shippAddressCols;
	

	public Long getAllocatedQuantity() {
			return this.allocatedQuantity;
		}
		public void setAllocatedQuantity(Long allocatedQuantity) {
			this.allocatedQuantity = allocatedQuantity;
		}
		public String getBranchCode() {
			return this.branchCode;
		}
		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}
		public String getBranchName() {
			return this.branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public Long getBranchStatus() {
			return this.branchStatus;
		}
		public void setBranchStatus(Long branchStatus) {
			this.branchStatus = branchStatus;
		}
		public Long getCancelQuantity() {
			return this.cancelQuantity;
		}
		public void setCancelQuantity(Long cancelQuantity) {
			this.cancelQuantity = cancelQuantity;
		}
		public Long getPrintQuantity() {
			return this.printQuantity;
		}
		public void setPrintQuantity(Long printQuantity) {
			this.printQuantity = printQuantity;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public List<ServiceInfoDto> getServiceInfoCols() {
			return this.serviceInfoCols;
		}
		public void setServiceInfoCols(List<ServiceInfoDto> serviceInfoCols) {
			this.serviceInfoCols = serviceInfoCols;
		}
		public List<AddressDto> getShippAddressCols() {
			return this.shippAddressCols;
		}
		public void setShippAddressCols(List<AddressDto> shippAddressCols) {
			this.shippAddressCols = shippAddressCols;
		}

}

	/**
 * CP网点信息及对应的商家的发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillApplySubscriptionInfo extends TaobaoObject {

	private static final long serialVersionUID = 4736242153641386673L;

	/**
		 * CP网点信息及对应的商家的发货信息
		 */
		@ApiListField("branch_account_cols")
		@ApiField("waybill_branch_account")
		private List<WaybillBranchAccount> branchAccountCols;
		/**
		 * 物流服务商ID
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 1是直营，2是加盟
		 */
		@ApiField("cp_type")
		private Long cpType;
	

	public List<WaybillBranchAccount> getBranchAccountCols() {
			return this.branchAccountCols;
		}
		public void setBranchAccountCols(List<WaybillBranchAccount> branchAccountCols) {
			this.branchAccountCols = branchAccountCols;
		}
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public Long getCpType() {
			return this.cpType;
		}
		public void setCpType(Long cpType) {
			this.cpType = cpType;
		}

}



}

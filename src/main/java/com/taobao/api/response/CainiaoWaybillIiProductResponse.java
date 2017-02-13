package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.product response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiProductResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1427455282758954475L;

	/** 
	 * 返回值
	 */
	@ApiListField("product_types")
	@ApiField("waybill_product_type")
	private List<WaybillProductType> productTypes;


	public void setProductTypes(List<WaybillProductType> productTypes) {
		this.productTypes = productTypes;
	}
	public List<WaybillProductType> getProductTypes( ) {
		return this.productTypes;
	}
	
	/**
 * 物流服务
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillServiceType extends TaobaoObject {

	private static final long serialVersionUID = 8631671349299587286L;

	/**
		 * code
		 */
		@ApiField("code")
		private String code;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}

}

	/**
 * 返回值
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillProductType extends TaobaoObject {

	private static final long serialVersionUID = 6193679564163113615L;

	/**
		 * 产品code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 产品名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 物流服务
		 */
		@ApiListField("service_types")
		@ApiField("waybill_service_type")
		private List<WaybillServiceType> serviceTypes;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<WaybillServiceType> getServiceTypes() {
			return this.serviceTypes;
		}
		public void setServiceTypes(List<WaybillServiceType> serviceTypes) {
			this.serviceTypes = serviceTypes;
		}

}



}

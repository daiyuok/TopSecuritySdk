package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoOpenstorageSellerResourceCreateResponse;

/**
 * TOP API: cainiao.openstorage.seller.resource.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.10
 */
public class CainiaoOpenstorageSellerResourceCreateRequest extends BaseTaobaoRequest<CainiaoOpenstorageSellerResourceCreateResponse> {
	
	

	/** 
	* 商家创建资源参数
	 */
	private String paramCreateSellerResourceRequest;

	public void setParamCreateSellerResourceRequest(String paramCreateSellerResourceRequest) {
		this.paramCreateSellerResourceRequest = paramCreateSellerResourceRequest;
	}

	public void setParamCreateSellerResourceRequest(CreateSellerResourceRequest paramCreateSellerResourceRequest) {
		this.paramCreateSellerResourceRequest = new JSONWriter(false,true).write(paramCreateSellerResourceRequest);
	}

	public String getParamCreateSellerResourceRequest() {
		return this.paramCreateSellerResourceRequest;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.seller.resource.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_create_seller_resource_request", this.paramCreateSellerResourceRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageSellerResourceCreateResponse> getResponseClass() {
		return CainiaoOpenstorageSellerResourceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 商家创建资源参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CreateSellerResourceRequest extends TaobaoObject {

	private static final long serialVersionUID = 5829722134957491957L;

	/**
		 * 父资源id，商家资源只能从isv模板或菜鸟标准模板继承修改，不能单独创建
		 */
		@ApiField("parent_resource_id")
		private Long parentResourceId;
		/**
		 * 资源内容
		 */
		@ApiField("resource_data")
		private String resourceData;
		/**
		 * 资源名称
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * 商家资源类型，共两类：ISV_RESOURCE -- 表示继承自isv的资源；CAINIAO_RESOURCE  -- 表示菜鸟的资源
		 */
		@ApiField("seller_resource_type")
		private String sellerResourceType;
	

	public Long getParentResourceId() {
			return this.parentResourceId;
		}
		public void setParentResourceId(Long parentResourceId) {
			this.parentResourceId = parentResourceId;
		}
		public String getResourceData() {
			return this.resourceData;
		}
		public void setResourceData(String resourceData) {
			this.resourceData = resourceData;
		}
		public String getResourceName() {
			return this.resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		public String getSellerResourceType() {
			return this.sellerResourceType;
		}
		public void setSellerResourceType(String sellerResourceType) {
			this.sellerResourceType = sellerResourceType;
		}

}


}
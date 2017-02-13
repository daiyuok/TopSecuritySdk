package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoOpenstorageResourceUpdateResponse;

/**
 * TOP API: cainiao.openstorage.resource.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.10
 */
public class CainiaoOpenstorageResourceUpdateRequest extends BaseTaobaoRequest<CainiaoOpenstorageResourceUpdateResponse> {
	
	

	/** 
	* 入参
	 */
	private String paramUpdateResourceRequest;

	public void setParamUpdateResourceRequest(String paramUpdateResourceRequest) {
		this.paramUpdateResourceRequest = paramUpdateResourceRequest;
	}

	public void setParamUpdateResourceRequest(UpdateResourceRequest paramUpdateResourceRequest) {
		this.paramUpdateResourceRequest = new JSONWriter(false,true).write(paramUpdateResourceRequest);
	}

	public String getParamUpdateResourceRequest() {
		return this.paramUpdateResourceRequest;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.resource.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_update_resource_request", this.paramUpdateResourceRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageResourceUpdateResponse> getResponseClass() {
		return CainiaoOpenstorageResourceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 入参
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateResourceRequest extends TaobaoObject {

	private static final long serialVersionUID = 7625949886511841185L;

	/**
		 * 要更新的资源内容
		 */
		@ApiField("resource_data")
		private String resourceData;
		/**
		 * 更新的资源id，必须指定
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * 更新的资源名称，如果不更新名称，只需将原有的资源名称填入即可
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * 资源的所有者，分为"ISV"和"SELLER"两类
		 */
		@ApiField("resource_owner_type")
		private String resourceOwnerType;
	

	public String getResourceData() {
			return this.resourceData;
		}
		public void setResourceData(String resourceData) {
			this.resourceData = resourceData;
		}
		public Long getResourceId() {
			return this.resourceId;
		}
		public void setResourceId(Long resourceId) {
			this.resourceId = resourceId;
		}
		public String getResourceName() {
			return this.resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		public String getResourceOwnerType() {
			return this.resourceOwnerType;
		}
		public void setResourceOwnerType(String resourceOwnerType) {
			this.resourceOwnerType = resourceOwnerType;
		}

}


}
package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoOpenstorageResourcePublishResponse;

/**
 * TOP API: cainiao.openstorage.resource.publish request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.10
 */
public class CainiaoOpenstorageResourcePublishRequest extends BaseTaobaoRequest<CainiaoOpenstorageResourcePublishResponse> {
	
	

	/** 
	* 资源发布参数
	 */
	private String paramPublishResourceRequest;

	public void setParamPublishResourceRequest(String paramPublishResourceRequest) {
		this.paramPublishResourceRequest = paramPublishResourceRequest;
	}

	public void setParamPublishResourceRequest(PublishResourceRequest paramPublishResourceRequest) {
		this.paramPublishResourceRequest = new JSONWriter(false,true).write(paramPublishResourceRequest);
	}

	public String getParamPublishResourceRequest() {
		return this.paramPublishResourceRequest;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.resource.publish";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_publish_resource_request", this.paramPublishResourceRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageResourcePublishResponse> getResponseClass() {
		return CainiaoOpenstorageResourcePublishResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 资源发布参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PublishResourceRequest extends TaobaoObject {

	private static final long serialVersionUID = 5788775374645529686L;

	/**
		 * 要发布的资源id
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * 资源所有者，分为"ISV"和"SELLER"两类
		 */
		@ApiField("resource_owner_type")
		private String resourceOwnerType;
	

	public Long getResourceId() {
			return this.resourceId;
		}
		public void setResourceId(Long resourceId) {
			this.resourceId = resourceId;
		}
		public String getResourceOwnerType() {
			return this.resourceOwnerType;
		}
		public void setResourceOwnerType(String resourceOwnerType) {
			this.resourceOwnerType = resourceOwnerType;
		}

}


}
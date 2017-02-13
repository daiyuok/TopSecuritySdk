package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoOpenstorageIsvResourceCreateResponse;

/**
 * TOP API: cainiao.openstorage.isv.resource.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.10
 */
public class CainiaoOpenstorageIsvResourceCreateRequest extends BaseTaobaoRequest<CainiaoOpenstorageIsvResourceCreateResponse> {
	
	

	/** 
	* isv创建资源的参数
	 */
	private String paramCreateIsvResourceRequest;

	public void setParamCreateIsvResourceRequest(String paramCreateIsvResourceRequest) {
		this.paramCreateIsvResourceRequest = paramCreateIsvResourceRequest;
	}

	public void setParamCreateIsvResourceRequest(CreateIsvResourceRequest paramCreateIsvResourceRequest) {
		this.paramCreateIsvResourceRequest = new JSONWriter(false,true).write(paramCreateIsvResourceRequest);
	}

	public String getParamCreateIsvResourceRequest() {
		return this.paramCreateIsvResourceRequest;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.isv.resource.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_create_isv_resource_request", this.paramCreateIsvResourceRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageIsvResourceCreateResponse> getResponseClass() {
		return CainiaoOpenstorageIsvResourceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * isv创建资源的参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CreateIsvResourceRequest extends TaobaoObject {

	private static final long serialVersionUID = 3123877174269688657L;

	/**
		 * isv资源类型，"TEMPLATE"表示模板资源，"PRINT_ITEM"表示打印项
		 */
		@ApiField("isv_resource_type")
		private String isvResourceType;
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
	

	public String getIsvResourceType() {
			return this.isvResourceType;
		}
		public void setIsvResourceType(String isvResourceType) {
			this.isvResourceType = isvResourceType;
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

}


}
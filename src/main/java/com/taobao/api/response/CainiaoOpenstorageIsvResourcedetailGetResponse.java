package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.isv.resourcedetail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageIsvResourcedetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2472711591852398456L;

	/** 
	 * result
	 */
	@ApiField("result")
	private CloudPrintBaseResult result;


	public void setResult(CloudPrintBaseResult result) {
		this.result = result;
	}
	public CloudPrintBaseResult getResult( ) {
		return this.result;
	}
	
	/**
 * isvResourceMetaInfo
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IsvResourceMetaInfo extends TaobaoObject {

	private static final long serialVersionUID = 7863528749564444536L;

	/**
		 * 是否需要发布，如果online_resource_data中没有值，则为true，表示需要发布
		 */
		@ApiField("need_publish")
		private Boolean needPublish;
		/**
		 * 资源id
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * 资源名称
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * 资源类型
		 */
		@ApiField("resource_type")
		private String resourceType;
	

	public Boolean getNeedPublish() {
			return this.needPublish;
		}
		public void setNeedPublish(Boolean needPublish) {
			this.needPublish = needPublish;
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
		public String getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

}

	/**
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IsvResourceResponse extends TaobaoObject {

	private static final long serialVersionUID = 4837423357673159252L;

	/**
		 * 编辑版本的内容
		 */
		@ApiField("editing_resource_data")
		private String editingResourceData;
		/**
		 * isvResourceMetaInfo
		 */
		@ApiField("isv_resource_meta_info")
		private IsvResourceMetaInfo isvResourceMetaInfo;
		/**
		 * 已发布的内容
		 */
		@ApiField("online_resource_data")
		private String onlineResourceData;
	

	public String getEditingResourceData() {
			return this.editingResourceData;
		}
		public void setEditingResourceData(String editingResourceData) {
			this.editingResourceData = editingResourceData;
		}
		public IsvResourceMetaInfo getIsvResourceMetaInfo() {
			return this.isvResourceMetaInfo;
		}
		public void setIsvResourceMetaInfo(IsvResourceMetaInfo isvResourceMetaInfo) {
			this.isvResourceMetaInfo = isvResourceMetaInfo;
		}
		public String getOnlineResourceData() {
			return this.onlineResourceData;
		}
		public void setOnlineResourceData(String onlineResourceData) {
			this.onlineResourceData = onlineResourceData;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 4847489647645719125L;

	/**
		 * data
		 */
		@ApiField("data")
		private IsvResourceResponse data;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误消息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 状态
		 */
		@ApiField("success")
		private Boolean success;
	

	public IsvResourceResponse getData() {
			return this.data;
		}
		public void setData(IsvResourceResponse data) {
			this.data = data;
		}
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

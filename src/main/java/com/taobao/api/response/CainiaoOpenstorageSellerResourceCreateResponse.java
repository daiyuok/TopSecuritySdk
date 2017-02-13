package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.seller.resource.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageSellerResourceCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3843446853114728196L;

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
 * sellerResourceMetaInfo
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SellerResourceMetaInfo extends TaobaoObject {

	private static final long serialVersionUID = 8818789383767587173L;

	/**
		 * needPublish
		 */
		@ApiField("need_publish")
		private Boolean needPublish;
		/**
		 * parentResourceId
		 */
		@ApiField("parent_resource_id")
		private Long parentResourceId;
		/**
		 * resourceId
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * resourceName
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * sellerResourceType
		 */
		@ApiField("seller_resource_type")
		private String sellerResourceType;
	

	public Boolean getNeedPublish() {
			return this.needPublish;
		}
		public void setNeedPublish(Boolean needPublish) {
			this.needPublish = needPublish;
		}
		public Long getParentResourceId() {
			return this.parentResourceId;
		}
		public void setParentResourceId(Long parentResourceId) {
			this.parentResourceId = parentResourceId;
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
		public String getSellerResourceType() {
			return this.sellerResourceType;
		}
		public void setSellerResourceType(String sellerResourceType) {
			this.sellerResourceType = sellerResourceType;
		}

}

	/**
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SellerResourceResponse extends TaobaoObject {

	private static final long serialVersionUID = 1665522232411635637L;

	/**
		 * 待发布的内容
		 */
		@ApiField("editing_resource_data")
		private String editingResourceData;
		/**
		 * 已经发布的内容，如果是第一次创建，则值为空
		 */
		@ApiField("online_resource_data")
		private String onlineResourceData;
		/**
		 * sellerResourceMetaInfo
		 */
		@ApiField("seller_resource_meta_info")
		private SellerResourceMetaInfo sellerResourceMetaInfo;
	

	public String getEditingResourceData() {
			return this.editingResourceData;
		}
		public void setEditingResourceData(String editingResourceData) {
			this.editingResourceData = editingResourceData;
		}
		public String getOnlineResourceData() {
			return this.onlineResourceData;
		}
		public void setOnlineResourceData(String onlineResourceData) {
			this.onlineResourceData = onlineResourceData;
		}
		public SellerResourceMetaInfo getSellerResourceMetaInfo() {
			return this.sellerResourceMetaInfo;
		}
		public void setSellerResourceMetaInfo(SellerResourceMetaInfo sellerResourceMetaInfo) {
			this.sellerResourceMetaInfo = sellerResourceMetaInfo;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 6225764742378552592L;

	/**
		 * data
		 */
		@ApiField("data")
		private SellerResourceResponse data;
		/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMessage
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public SellerResourceResponse getData() {
			return this.data;
		}
		public void setData(SellerResourceResponse data) {
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

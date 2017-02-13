package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.seller.resourcedetail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageSellerResourcedetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3568429917968172558L;

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

	private static final long serialVersionUID = 6482158778423482893L;

	/**
		 * 是否需要发布
		 */
		@ApiField("need_publish")
		private Boolean needPublish;
		/**
		 * 父资源id
		 */
		@ApiField("parent_resource_id")
		private Long parentResourceId;
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
		 * 商家资源类型
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

	private static final long serialVersionUID = 1629684772653694181L;

	/**
		 * 正在编辑的资源内容
		 */
		@ApiField("editing_resource_data")
		private String editingResourceData;
		/**
		 * 已发布的资源内容
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

	private static final long serialVersionUID = 4595992815219419435L;

	/**
		 * data
		 */
		@ApiField("data")
		private SellerResourceResponse data;
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

package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cloudprint.customarea.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintCustomareaUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1291316552126799651L;

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
 * keys
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 5472257664294261956L;

	/**
		 * keyName
		 */
		@ApiField("key_name")
		private String keyName;
	

	public String getKeyName() {
			return this.keyName;
		}
		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

}

	/**
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CustomAreaResult extends TaobaoObject {

	private static final long serialVersionUID = 3552276441439655972L;

	/**
		 * customAreaId
		 */
		@ApiField("custom_area_id")
		private Long customAreaId;
		/**
		 * customAreaUrl
		 */
		@ApiField("custom_area_url")
		private String customAreaUrl;
		/**
		 * keys
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
	

	public Long getCustomAreaId() {
			return this.customAreaId;
		}
		public void setCustomAreaId(Long customAreaId) {
			this.customAreaId = customAreaId;
		}
		public String getCustomAreaUrl() {
			return this.customAreaUrl;
		}
		public void setCustomAreaUrl(String customAreaUrl) {
			this.customAreaUrl = customAreaUrl;
		}
		public List<KeyResult> getKeys() {
			return this.keys;
		}
		public void setKeys(List<KeyResult> keys) {
			this.keys = keys;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 2669293176494773181L;

	/**
		 * data
		 */
		@ApiField("data")
		private CustomAreaResult data;
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
	

	public CustomAreaResult getData() {
			return this.data;
		}
		public void setData(CustomAreaResult data) {
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

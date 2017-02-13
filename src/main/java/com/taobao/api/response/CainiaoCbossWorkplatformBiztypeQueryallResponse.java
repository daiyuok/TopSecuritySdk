package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.biztype.queryall response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformBiztypeQueryallResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8644412259618193448L;

	/** 
	 * bizTypeJson
	 */
	@ApiField("biz_type_json")
	private String bizTypeJson;

	/** 
	 * errorCode
	 */
	@ApiField("res_error_code")
	private String resErrorCode;

	/** 
	 * errorMsg
	 */
	@ApiField("res_error_msg")
	private String resErrorMsg;

	/** 
	 * success
	 */
	@ApiField("res_success")
	private Boolean resSuccess;


	public void setBizTypeJson(String bizTypeJson) {
		this.bizTypeJson = bizTypeJson;
	}
	public String getBizTypeJson( ) {
		return this.bizTypeJson;
	}

	public void setResErrorCode(String resErrorCode) {
		this.resErrorCode = resErrorCode;
	}
	public String getResErrorCode( ) {
		return this.resErrorCode;
	}

	public void setResErrorMsg(String resErrorMsg) {
		this.resErrorMsg = resErrorMsg;
	}
	public String getResErrorMsg( ) {
		return this.resErrorMsg;
	}

	public void setResSuccess(Boolean resSuccess) {
		this.resSuccess = resSuccess;
	}
	public Boolean getResSuccess( ) {
		return this.resSuccess;
	}
	


}

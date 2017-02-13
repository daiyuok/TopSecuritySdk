package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.logistics.iscainiaoorder response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformLogisticsIscainiaoorderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5842472969674692379L;

	/** 
	 * isCainiaoOrder
	 */
	@ApiField("is_cainiao_order")
	private Boolean isCainiaoOrder;

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


	public void setIsCainiaoOrder(Boolean isCainiaoOrder) {
		this.isCainiaoOrder = isCainiaoOrder;
	}
	public Boolean getIsCainiaoOrder( ) {
		return this.isCainiaoOrder;
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

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.reachable.feedback response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressReachableFeedbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4182925267297324824L;

	/** 
	 * 调用是否成功：true-反馈成功；false-反馈失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 错误返回码
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 错误返回信息
	 */
	@ApiField("ret_msg")
	private String retMsg;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getRetMsg( ) {
		return this.retMsg;
	}
	


}

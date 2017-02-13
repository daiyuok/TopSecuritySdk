package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.service.validate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasServiceValidateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4861353546359552595L;

	/** 
	 * none 没有订购,open 已经开通服务,freeze 服务已经冻结,close 服务已经关闭,error 系统错误
	 */
	@ApiField("status")
	private String status;


	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}
	


}

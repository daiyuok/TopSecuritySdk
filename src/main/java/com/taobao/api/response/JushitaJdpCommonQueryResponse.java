package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.common.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpCommonQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4512658171151595282L;

	/** 
	 * 结果的json串
	 */
	@ApiField("json_str")
	private String jsonStr;


	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}
	public String getJsonStr( ) {
		return this.jsonStr;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.astrolabe.mapping.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AstrolabeMappingGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8658575931981961836L;

	/** 
	 * 卖家Id与授权AppKey的映射Mapping
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}
	


}

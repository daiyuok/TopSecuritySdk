package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.items.marking response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenItemsMarkingResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8174925173364852529L;

	/** 
	 * flag
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * message
	 */
	@ApiField("message")
	private String message;


	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}
	


}

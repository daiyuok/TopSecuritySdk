package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.sdk.feedback.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopSdkFeedbackUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4694827629917475979L;

	/** 
	 * 控制回传间隔（单位：秒）
	 */
	@ApiField("upload_interval")
	private Long uploadInterval;


	public void setUploadInterval(Long uploadInterval) {
		this.uploadInterval = uploadInterval;
	}
	public Long getUploadInterval( ) {
		return this.uploadInterval;
	}
	


}

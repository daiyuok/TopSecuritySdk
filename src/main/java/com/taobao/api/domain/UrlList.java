package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * url列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UrlList extends TaobaoObject {

	private static final long serialVersionUID = 4338315335926774697L;

	/**
	 * url列表
	 */
	@ApiField("url")
	private String url;


	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

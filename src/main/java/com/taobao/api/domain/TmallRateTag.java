package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 天猫评价标签对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TmallRateTag extends TaobaoObject {

	private static final long serialVersionUID = 2779494689297192238L;

	/**
	 * 表示标签的极性，正极true，负极false
	 */
	@ApiField("posi")
	private Boolean posi;

	/**
	 * 表示标签的名称
	 */
	@ApiField("tag_name")
	private String tagName;


	public Boolean getPosi() {
		return this.posi;
	}
	public void setPosi(Boolean posi) {
		this.posi = posi;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}

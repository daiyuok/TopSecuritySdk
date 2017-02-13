package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 天猫评价标签详细信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TmallRateTagDetail extends TaobaoObject {

	private static final long serialVersionUID = 5256656241553734474L;

	/**
	 * 反应该标签的评价数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 标签的极性：1正极 -1负极
	 */
	@ApiField("posi")
	private Boolean posi;

	/**
	 * 标签名称
	 */
	@ApiField("tag_name")
	private String tagName;


	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

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

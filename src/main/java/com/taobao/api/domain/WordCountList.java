package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 关键词统计
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WordCountList extends TaobaoObject {

	private static final long serialVersionUID = 5534253213642191939L;

	/**
	 * 关键词数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 关键词
	 */
	@ApiField("word")
	private String word;


	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getWord() {
		return this.word;
	}
	public void setWord(String word) {
		this.word = word;
	}

}

package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 关键词列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WordList extends TaobaoObject {

	private static final long serialVersionUID = 5771812577534288151L;

	/**
	 * 关键词
	 */
	@ApiField("word")
	private String word;


	public String getWord() {
		return this.word;
	}
	public void setWord(String word) {
		this.word = word;
	}

}

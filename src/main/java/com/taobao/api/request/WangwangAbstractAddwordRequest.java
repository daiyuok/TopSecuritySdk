package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangAbstractAddwordResponse;

/**
 * TOP API: taobao.wangwang.abstract.addword request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.11
 */
public class WangwangAbstractAddwordRequest extends BaseTaobaoRequest<WangwangAbstractAddwordResponse> {
	
	

	/** 
	* 传入参数的字符集
	 */
	private String charset;

	/** 
	* 关键词，长度大于0
	 */
	private String word;

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getCharset() {
		return this.charset;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return this.word;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.abstract.addword";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charset", this.charset);
		txtParams.put("word", this.word);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangAbstractAddwordResponse> getResponseClass() {
		return WangwangAbstractAddwordResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(word, "word");
		RequestCheckUtils.checkMaxLength(word, 12, "word");
	}
	

}
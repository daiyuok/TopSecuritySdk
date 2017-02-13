package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangAbstractGetwordlistResponse;

/**
 * TOP API: taobao.wangwang.abstract.getwordlist request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.11
 */
public class WangwangAbstractGetwordlistRequest extends BaseTaobaoRequest<WangwangAbstractGetwordlistResponse> {
	
	

	/** 
	* 传入参数的字符集
	 */
	private String charset;

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getCharset() {
		return this.charset;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.abstract.getwordlist";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charset", this.charset);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangAbstractGetwordlistResponse> getResponseClass() {
		return WangwangAbstractGetwordlistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
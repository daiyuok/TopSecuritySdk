package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.OcTradesBytagGetResponse;

/**
 * TOP API: taobao.oc.trades.bytag.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.17
 */
public class OcTradesBytagGetRequest extends BaseTaobaoRequest<OcTradesBytagGetResponse> {
	
	

	/** 
	* 当前页
	 */
	private Long page;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 标签名称
	 */
	private String tagName;

	/** 
	* 标签类型，1官方，2自定义
	 */
	private Long tagType;

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagType(Long tagType) {
		this.tagType = tagType;
	}

	public Long getTagType() {
		return this.tagType;
	}

	public String getApiMethodName() {
		return "taobao.oc.trades.bytag.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page", this.page);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("tag_name", this.tagName);
		txtParams.put("tag_type", this.tagType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcTradesBytagGetResponse> getResponseClass() {
		return OcTradesBytagGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tagName, "tagName");
		RequestCheckUtils.checkNotEmpty(tagType, "tagType");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercatsListUpdateResponse;

/**
 * TOP API: taobao.sellercats.list.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class SellercatsListUpdateRequest extends BaseTaobaoRequest<SellercatsListUpdateResponse> {
	
	

	/** 
	* 卖家自定义类目编号
	 */
	private Long cid;

	/** 
	* 卖家自定义类目名称。不超过20个字符
	 */
	private String name;

	/** 
	* 链接图片URL地址
	 */
	private String pictUrl;

	/** 
	* 该类目在页面上的排序位置,取值范围:大于零的整数
	 */
	private Long sortOrder;

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}

	public String getPictUrl() {
		return this.pictUrl;
	}

	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}

	public String getApiMethodName() {
		return "taobao.sellercats.list.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("name", this.name);
		txtParams.put("pict_url", this.pictUrl);
		txtParams.put("sort_order", this.sortOrder);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercatsListUpdateResponse> getResponseClass() {
		return SellercatsListUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cid, "cid");
	}
	

}
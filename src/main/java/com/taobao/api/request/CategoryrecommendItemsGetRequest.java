package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CategoryrecommendItemsGetResponse;

/**
 * TOP API: taobao.categoryrecommend.items.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.06
 */
public class CategoryrecommendItemsGetRequest extends BaseTaobaoRequest<CategoryrecommendItemsGetResponse> {
	
	

	/** 
	* 传入叶子类目ID
	 */
	private Long categoryId;

	/** 
	* 请求个数，建议获取20个
	 */
	private Long count;

	/** 
	* 额外参数
	 */
	private String ext;

	/** 
	* 请求类型，1：类目下热门商品推荐。其他值当非法值处理
	 */
	private Long recommendType;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getCount() {
		return this.count;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setRecommendType(Long recommendType) {
		this.recommendType = recommendType;
	}

	public Long getRecommendType() {
		return this.recommendType;
	}

	public String getApiMethodName() {
		return "taobao.categoryrecommend.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("count", this.count);
		txtParams.put("ext", this.ext);
		txtParams.put("recommend_type", this.recommendType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CategoryrecommendItemsGetResponse> getResponseClass() {
		return CategoryrecommendItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(count, "count");
		RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
	}
	

}
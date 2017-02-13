package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallBrandcatMetadataGetResponse;

/**
 * TOP API: tmall.brandcat.metadata.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class TmallBrandcatMetadataGetRequest extends BaseTaobaoRequest<TmallBrandcatMetadataGetResponse> {
	
	

	/** 
	* 品牌id
	 */
	private Long brandId;

	/** 
	* 叶子类目id
	 */
	private Long catId;

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return this.brandId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getCatId() {
		return this.catId;
	}

	public String getApiMethodName() {
		return "tmall.brandcat.metadata.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("brand_id", this.brandId);
		txtParams.put("cat_id", this.catId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallBrandcatMetadataGetResponse> getResponseClass() {
		return TmallBrandcatMetadataGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(catId, "catId");
	}
	

}
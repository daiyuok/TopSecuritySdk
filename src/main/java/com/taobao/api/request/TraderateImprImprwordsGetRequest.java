package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TraderateImprImprwordsGetResponse;

/**
 * TOP API: taobao.traderate.impr.imprwords.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.06
 */
public class TraderateImprImprwordsGetRequest extends BaseTaobaoRequest<TraderateImprImprwordsGetResponse> {
	
	

	/** 
	* 淘宝叶子类目id
	 */
	private Long catLeafId;

	/** 
	* 淘宝一级类目id
	 */
	private Long catRootId;

	public void setCatLeafId(Long catLeafId) {
		this.catLeafId = catLeafId;
	}

	public Long getCatLeafId() {
		return this.catLeafId;
	}

	public void setCatRootId(Long catRootId) {
		this.catRootId = catRootId;
	}

	public Long getCatRootId() {
		return this.catRootId;
	}

	public String getApiMethodName() {
		return "taobao.traderate.impr.imprwords.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cat_leaf_id", this.catLeafId);
		txtParams.put("cat_root_id", this.catRootId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TraderateImprImprwordsGetResponse> getResponseClass() {
		return TraderateImprImprwordsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(catRootId, "catRootId");
	}
	

}
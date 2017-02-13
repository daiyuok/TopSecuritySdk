package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemRecommendAddResponse;

/**
 * TOP API: taobao.item.recommend.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.18
 */
public class ItemRecommendAddRequest extends BaseTaobaoRequest<ItemRecommendAddResponse> {
	
	

	/** 
	* 商品数字ID，该参数必须
	 */
	private Long numIid;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.recommend.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemRecommendAddResponse> getResponseClass() {
		return ItemRecommendAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
	}
	

}
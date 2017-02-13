package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDistributorProductsGetResponse;

/**
 * TOP API: taobao.fenxiao.distributor.products.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.01.19
 */
public class FenxiaoDistributorProductsGetRequest extends BaseTaobaoRequest<FenxiaoDistributorProductsGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.fenxiao.distributor.products.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDistributorProductsGetResponse> getResponseClass() {
		return FenxiaoDistributorProductsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
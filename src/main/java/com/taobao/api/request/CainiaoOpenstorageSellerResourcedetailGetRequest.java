package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoOpenstorageSellerResourcedetailGetResponse;

/**
 * TOP API: cainiao.openstorage.seller.resourcedetail.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.25
 */
public class CainiaoOpenstorageSellerResourcedetailGetRequest extends BaseTaobaoRequest<CainiaoOpenstorageSellerResourcedetailGetResponse> {
	
	

	/** 
	* 商家资源id
	 */
	private Long sellerResourceId;

	public void setSellerResourceId(Long sellerResourceId) {
		this.sellerResourceId = sellerResourceId;
	}

	public Long getSellerResourceId() {
		return this.sellerResourceId;
	}

	public String getApiMethodName() {
		return "cainiao.openstorage.seller.resourcedetail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("seller_resource_id", this.sellerResourceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoOpenstorageSellerResourcedetailGetResponse> getResponseClass() {
		return CainiaoOpenstorageSellerResourcedetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
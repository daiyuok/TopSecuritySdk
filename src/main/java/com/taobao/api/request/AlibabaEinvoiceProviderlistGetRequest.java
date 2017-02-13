package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceProviderlistGetResponse;

/**
 * TOP API: alibaba.einvoice.providerlist.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.31
 */
public class AlibabaEinvoiceProviderlistGetRequest extends BaseTaobaoRequest<AlibabaEinvoiceProviderlistGetResponse> {
	
	

	public String getApiMethodName() {
		return "alibaba.einvoice.providerlist.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceProviderlistGetResponse> getResponseClass() {
		return AlibabaEinvoiceProviderlistGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
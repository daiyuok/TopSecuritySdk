package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceSerialnoBatchGenerateResponse;

/**
 * TOP API: alibaba.einvoice.serialno.batch.generate request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.27
 */
public class AlibabaEinvoiceSerialnoBatchGenerateRequest extends BaseTaobaoRequest<AlibabaEinvoiceSerialnoBatchGenerateResponse> {
	
	

	public String getApiMethodName() {
		return "alibaba.einvoice.serialno.batch.generate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceSerialnoBatchGenerateResponse> getResponseClass() {
		return AlibabaEinvoiceSerialnoBatchGenerateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
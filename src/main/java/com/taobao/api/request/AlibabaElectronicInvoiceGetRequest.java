package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaElectronicInvoiceGetResponse;

/**
 * TOP API: alibaba.electronic.invoice.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.31
 */
public class AlibabaElectronicInvoiceGetRequest extends BaseTaobaoRequest<AlibabaElectronicInvoiceGetResponse> {
	
	

	/** 
	* 淘宝主订单号
	 */
	private Long tid;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "alibaba.electronic.invoice.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaElectronicInvoiceGetResponse> getResponseClass() {
		return AlibabaElectronicInvoiceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
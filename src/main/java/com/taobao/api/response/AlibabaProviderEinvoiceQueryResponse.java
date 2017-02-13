package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ProviderEinvoice;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.provider.einvoice.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaProviderEinvoiceQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5783986367114949361L;

	/** 
	 * 电子发票列表
	 */
	@ApiListField("einvoice_list")
	@ApiField("provider_einvoice")
	private List<ProviderEinvoice> einvoiceList;


	public void setEinvoiceList(List<ProviderEinvoice> einvoiceList) {
		this.einvoiceList = einvoiceList;
	}
	public List<ProviderEinvoice> getEinvoiceList( ) {
		return this.einvoiceList;
	}
	


}

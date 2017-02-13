package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AddressResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.modify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressModifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4899534269516149994L;

	/** 
	 * 只返回修改时间modify_date
	 */
	@ApiField("address_result")
	private AddressResult addressResult;


	public void setAddressResult(AddressResult addressResult) {
		this.addressResult = addressResult;
	}
	public AddressResult getAddressResult( ) {
		return this.addressResult;
	}
	


}

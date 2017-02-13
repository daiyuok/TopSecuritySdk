package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1717575298442978442L;

	/** 
	 * 模板内容
	 */
	@ApiField("print_data")
	private String printData;

	/** 
	 * 面单号
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public void setPrintData(String printData) {
		this.printData = printData;
	}
	public String getPrintData( ) {
		return this.printData;
	}

	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}
	public String getWaybillCode( ) {
		return this.waybillCode;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.FreshWaybill;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.shengxian.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillShengxianGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2813481464145633627L;

	/** 
	 * 成功后返回的生鲜电子面单信息
	 */
	@ApiField("fresh_waybill")
	private FreshWaybill freshWaybill;

	/** 
	 * 生成是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setFreshWaybill(FreshWaybill freshWaybill) {
		this.freshWaybill = freshWaybill;
	}
	public FreshWaybill getFreshWaybill( ) {
		return this.freshWaybill;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

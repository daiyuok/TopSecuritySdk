package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallStoredeliverAllocationAcceptResponse;

/**
 * TOP API: tmall.storedeliver.allocation.accept request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.29
 */
public class TmallStoredeliverAllocationAcceptRequest extends BaseTaobaoRequest<TmallStoredeliverAllocationAcceptResponse> {
	
	

	/** 
	* 派单号
	 */
	private String allocationCode;

	/** 
	* 是否接单
	 */
	private Boolean isAccept;

	/** 
	* 子订单号必须和派单号匹配
	 */
	private String subOrderCode;

	public void setAllocationCode(String allocationCode) {
		this.allocationCode = allocationCode;
	}

	public String getAllocationCode() {
		return this.allocationCode;
	}

	public void setIsAccept(Boolean isAccept) {
		this.isAccept = isAccept;
	}

	public Boolean getIsAccept() {
		return this.isAccept;
	}

	public void setSubOrderCode(String subOrderCode) {
		this.subOrderCode = subOrderCode;
	}

	public String getSubOrderCode() {
		return this.subOrderCode;
	}

	public String getApiMethodName() {
		return "tmall.storedeliver.allocation.accept";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("allocation_code", this.allocationCode);
		txtParams.put("is_accept", this.isAccept);
		txtParams.put("sub_order_code", this.subOrderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallStoredeliverAllocationAcceptResponse> getResponseClass() {
		return TmallStoredeliverAllocationAcceptResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(allocationCode, "allocationCode");
		RequestCheckUtils.checkNotEmpty(isAccept, "isAccept");
		RequestCheckUtils.checkNotEmpty(subOrderCode, "subOrderCode");
		RequestCheckUtils.checkMaxListSize(subOrderCode, 20, "subOrderCode");
	}
	

}
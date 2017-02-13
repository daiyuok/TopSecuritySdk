package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeConfirmfeeGetResponse;

/**
 * TOP API: taobao.trade.confirmfee.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.14
 */
public class TradeConfirmfeeGetRequest extends BaseTaobaoRequest<TradeConfirmfeeGetResponse> {
	
	

	/** 
	* 交易主订单或子订单ID
	 */
	private Long tid;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.confirmfee.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeConfirmfeeGetResponse> getResponseClass() {
		return TradeConfirmfeeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
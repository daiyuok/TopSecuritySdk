package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JdsTradeTracesGetResponse;

/**
 * TOP API: taobao.jds.trade.traces.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.06.16
 */
public class JdsTradeTracesGetRequest extends BaseTaobaoRequest<JdsTradeTracesGetResponse> {
	
	

	/** 
	* 是否返回用户的状态(是否存在)
	 */
	private Boolean returnUserStatus;

	/** 
	* 淘宝的订单tid
	 */
	private Long tid;

	public void setReturnUserStatus(Boolean returnUserStatus) {
		this.returnUserStatus = returnUserStatus;
	}

	public Boolean getReturnUserStatus() {
		return this.returnUserStatus;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.jds.trade.traces.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("return_user_status", this.returnUserStatus);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JdsTradeTracesGetResponse> getResponseClass() {
		return JdsTradeTracesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
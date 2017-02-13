package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCbossWorkplatformLogisticsIscainiaoorderResponse;

/**
 * TOP API: cainiao.cboss.workplatform.logistics.iscainiaoorder request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.14
 */
public class CainiaoCbossWorkplatformLogisticsIscainiaoorderRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformLogisticsIscainiaoorderResponse> {
	
	

	/** 
	* 交易单号
	 */
	private String tradeId;

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.logistics.iscainiaoorder";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformLogisticsIscainiaoorderResponse> getResponseClass() {
		return CainiaoCbossWorkplatformLogisticsIscainiaoorderResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCbossWorkplatformBiztypeQueryallResponse;

/**
 * TOP API: cainiao.cboss.workplatform.biztype.queryall request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.14
 */
public class CainiaoCbossWorkplatformBiztypeQueryallRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformBiztypeQueryallResponse> {
	
	

	/** 
	* level
	 */
	private Long level;

	/** 
	* tradeId
	 */
	private String tradeId;

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.biztype.queryall";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("level", this.level);
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformBiztypeQueryallResponse> getResponseClass() {
		return CainiaoCbossWorkplatformBiztypeQueryallResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
	}
	

}
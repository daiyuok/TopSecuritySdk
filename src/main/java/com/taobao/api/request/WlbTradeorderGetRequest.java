package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbTradeorderGetResponse;

/**
 * TOP API: taobao.wlb.tradeorder.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.14
 */
public class WlbTradeorderGetRequest extends BaseTaobaoRequest<WlbTradeorderGetResponse> {
	
	

	/** 
	* 子交易号
	 */
	private String subTradeId;

	/** 
	* 指定交易类型的交易号
	 */
	private String tradeId;

	/** 
	* 交易类型: TAOBAO--淘宝交易 OTHER_TRADE--其它交易
	 */
	private String tradeType;

	public void setSubTradeId(String subTradeId) {
		this.subTradeId = subTradeId;
	}

	public String getSubTradeId() {
		return this.subTradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public String getApiMethodName() {
		return "taobao.wlb.tradeorder.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sub_trade_id", this.subTradeId);
		txtParams.put("trade_id", this.tradeId);
		txtParams.put("trade_type", this.tradeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbTradeorderGetResponse> getResponseClass() {
		return WlbTradeorderGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
		RequestCheckUtils.checkNotEmpty(tradeType, "tradeType");
	}
	

}
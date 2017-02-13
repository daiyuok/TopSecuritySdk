package com.taobao.api.request;

import com.taobao.api.domain.WlbWmsSkuInfoConfirm;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsSkuInfoConfirmResponse;

/**
 * TOP API: taobao.wlb.wms.sku.info.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.29
 */
public class WlbWmsSkuInfoConfirmRequest extends BaseTaobaoRequest<WlbWmsSkuInfoConfirmResponse> {
	
	

	/** 
	* 商品资料回告
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsSkuInfoConfirm content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.sku.info.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsSkuInfoConfirmResponse> getResponseClass() {
		return WlbWmsSkuInfoConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
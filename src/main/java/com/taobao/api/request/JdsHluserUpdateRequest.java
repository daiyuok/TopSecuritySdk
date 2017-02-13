package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JdsHluserUpdateResponse;

/**
 * TOP API: taobao.jds.hluser.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.02.25
 */
public class JdsHluserUpdateRequest extends BaseTaobaoRequest<JdsHluserUpdateResponse> {
	
	

	/** 
	* 回流信息是否开通买家端展示,可选值open,close
	 */
	private String openForBuyer;

	/** 
	* 为空,则默认是X_TO_SYSTEM,X_WAIT_ALLOCATION,X_OUT_WAREHOUSE 可选值是X_DOWNLOADED,X_TO_SYSTEM,X_SERVICE_AUDITED,X_FINANCE_AUDITED,X_ALLOCATION_NOTIFIED,X_WAIT_ALLOCATION,X_SORT_PRINTED,X_SEND_PRINTED,X_LOGISTICS_PRINTED,X_SORTED,X_EXAMINED,X_PACKAGED,X_WEIGHED,X_OUT_WAREHOUS
	 */
	private String openNodes;

	public void setOpenForBuyer(String openForBuyer) {
		this.openForBuyer = openForBuyer;
	}

	public String getOpenForBuyer() {
		return this.openForBuyer;
	}

	public void setOpenNodes(String openNodes) {
		this.openNodes = openNodes;
	}

	public String getOpenNodes() {
		return this.openNodes;
	}

	public String getApiMethodName() {
		return "taobao.jds.hluser.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("open_for_buyer", this.openForBuyer);
		txtParams.put("open_nodes", this.openNodes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JdsHluserUpdateResponse> getResponseClass() {
		return JdsHluserUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
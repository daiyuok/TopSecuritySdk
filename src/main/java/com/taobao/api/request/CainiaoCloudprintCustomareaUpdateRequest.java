package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCloudprintCustomareaUpdateResponse;

/**
 * TOP API: cainiao.cloudprint.customarea.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.19
 */
public class CainiaoCloudprintCustomareaUpdateRequest extends BaseTaobaoRequest<CainiaoCloudprintCustomareaUpdateResponse> {
	
	

	/** 
	* 自定义区内容（可修改）
	 */
	private String customAreaContent;

	/** 
	* 自定义区id（不可修改）
	 */
	private Long customAreaId;

	/** 
	* 自定义区名称（可修改）
	 */
	private String customAreaName;

	public void setCustomAreaContent(String customAreaContent) {
		this.customAreaContent = customAreaContent;
	}

	public String getCustomAreaContent() {
		return this.customAreaContent;
	}

	public void setCustomAreaId(Long customAreaId) {
		this.customAreaId = customAreaId;
	}

	public Long getCustomAreaId() {
		return this.customAreaId;
	}

	public void setCustomAreaName(String customAreaName) {
		this.customAreaName = customAreaName;
	}

	public String getCustomAreaName() {
		return this.customAreaName;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.customarea.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("custom_area_content", this.customAreaContent);
		txtParams.put("custom_area_id", this.customAreaId);
		txtParams.put("custom_area_name", this.customAreaName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintCustomareaUpdateResponse> getResponseClass() {
		return CainiaoCloudprintCustomareaUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(customAreaContent, "customAreaContent");
		RequestCheckUtils.checkNotEmpty(customAreaId, "customAreaId");
		RequestCheckUtils.checkNotEmpty(customAreaName, "customAreaName");
	}
	

}
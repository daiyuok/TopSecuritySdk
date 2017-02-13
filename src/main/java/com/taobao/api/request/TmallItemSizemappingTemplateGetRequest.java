package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemSizemappingTemplateGetResponse;

/**
 * TOP API: tmall.item.sizemapping.template.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.23
 */
public class TmallItemSizemappingTemplateGetRequest extends BaseTaobaoRequest<TmallItemSizemappingTemplateGetResponse> {
	
	

	/** 
	* 尺码表模板ID
	 */
	private Long templateId;

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public String getApiMethodName() {
		return "tmall.item.sizemapping.template.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("template_id", this.templateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemSizemappingTemplateGetResponse> getResponseClass() {
		return TmallItemSizemappingTemplateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
	}
	

}
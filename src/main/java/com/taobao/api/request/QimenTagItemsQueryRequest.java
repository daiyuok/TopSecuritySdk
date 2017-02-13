package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.QimenTagItemsQueryResponse;

/**
 * TOP API: taobao.qimen.tag.items.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.04
 */
public class QimenTagItemsQueryRequest extends BaseTaobaoRequest<QimenTagItemsQueryResponse> {
	
	

	/** 
	* 备注，string（500）
	 */
	private String remark;

	/** 
	* 打标值，string（50），TBKU=同步库存标，MDZT=门店自提标，必填
	 */
	private String tagType;

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getTagType() {
		return this.tagType;
	}

	public String getApiMethodName() {
		return "taobao.qimen.tag.items.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("remark", this.remark);
		txtParams.put("tag_type", this.tagType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenTagItemsQueryResponse> getResponseClass() {
		return QimenTagItemsQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tagType, "tagType");
	}
	

}
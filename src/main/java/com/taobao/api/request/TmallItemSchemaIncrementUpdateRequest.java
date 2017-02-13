package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemSchemaIncrementUpdateResponse;

/**
 * TOP API: tmall.item.schema.increment.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.03
 */
public class TmallItemSchemaIncrementUpdateRequest extends BaseTaobaoRequest<TmallItemSchemaIncrementUpdateResponse> {
	
	

	/** 
	* 需要编辑的商品ID
	 */
	private Long itemId;

	/** 
	* 根据tmall.item.increment.update.schema.get生成的商品增量编辑规则入参数据。需要更新的字段，一定要在入参的XML重点update_fields字段中明确指明
	 */
	private String xmlData;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "tmall.item.schema.increment.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemSchemaIncrementUpdateResponse> getResponseClass() {
		return TmallItemSchemaIncrementUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}
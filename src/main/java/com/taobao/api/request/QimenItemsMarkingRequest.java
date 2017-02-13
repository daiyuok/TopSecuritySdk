package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.QimenItemsMarkingResponse;

/**
 * TOP API: taobao.qimen.items.marking request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.04
 */
public class QimenItemsMarkingRequest extends BaseTaobaoRequest<QimenItemsMarkingResponse> {
	
	

	/** 
	* 操作类型，string（50），ADD=打标，DELETE=去标，必填
	 */
	private String actionType;

	/** 
	* 线上商品ID，long，必填
	 */
	private String itemIds;

	/** 
	* 备注，string（500）
	 */
	private String remark;

	/** 
	* 打标值，string（50），TBKU=同步库存标，MDZT=门店自提标，必填
	 */
	private String tagType;

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

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
		return "taobao.qimen.items.marking";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action_type", this.actionType);
		txtParams.put("item_ids", this.itemIds);
		txtParams.put("remark", this.remark);
		txtParams.put("tag_type", this.tagType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenItemsMarkingResponse> getResponseClass() {
		return QimenItemsMarkingResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionType, "actionType");
		RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
		RequestCheckUtils.checkMaxListSize(itemIds, 20, "itemIds");
		RequestCheckUtils.checkNotEmpty(tagType, "tagType");
	}
	

}
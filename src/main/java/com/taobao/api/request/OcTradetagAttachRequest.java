package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.OcTradetagAttachResponse;

/**
 * TOP API: taobao.oc.tradetag.attach request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.17
 */
public class OcTradetagAttachRequest extends BaseTaobaoRequest<OcTradetagAttachResponse> {
	
	

	/** 
	* 标签名称
	 */
	private String tagName;

	/** 
	* 标签类型       1：官方标签      2：自定义标签
	 */
	private Long tagType;

	/** 
	* 标签值，json格式
	 */
	private String tagValue;

	/** 
	* 订单id
	 */
	private Long tid;

	/** 
	* 该标签在消费者端是否显示,0:不显示,1：显示
	 */
	private Long visible;

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagType(Long tagType) {
		this.tagType = tagType;
	}

	public Long getTagType() {
		return this.tagType;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setVisible(Long visible) {
		this.visible = visible;
	}

	public Long getVisible() {
		return this.visible;
	}

	public String getApiMethodName() {
		return "taobao.oc.tradetag.attach";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tag_name", this.tagName);
		txtParams.put("tag_type", this.tagType);
		txtParams.put("tag_value", this.tagValue);
		txtParams.put("tid", this.tid);
		txtParams.put("visible", this.visible);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcTradetagAttachResponse> getResponseClass() {
		return OcTradetagAttachResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tagName, "tagName");
		RequestCheckUtils.checkNotEmpty(tagValue, "tagValue");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}
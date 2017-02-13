package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemsListGetResponse;

/**
 * TOP API: taobao.items.list.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.03
 */
public class ItemsListGetRequest extends BaseTaobaoRequest<ItemsListGetResponse> {
	
	

	/** 
	* 需要返回的商品对象字段。可选值：Item商品结构体中字段均可返回(其中item_weight,item_size,sold_quantity暂未返回)；多个字段用“,”分隔。如果想返回整个子对象，fields设置相应字段，如itemimg；如果想返回子对象里面的某个字段，那字段设为某个值，如itemimg.url。
	 */
	private String fields;

	/** 
	* 商品数字id列表，多个num_iid用逗号隔开，一次不超过20个。
	 */
	private String numIids;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}

	public String getNumIids() {
		return this.numIids;
	}

	public String getApiMethodName() {
		return "taobao.items.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iids", this.numIids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemsListGetResponse> getResponseClass() {
		return ItemsListGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 1000, "fields");
		RequestCheckUtils.checkMaxListSize(numIids, 1000, "numIids");
	}
	

}
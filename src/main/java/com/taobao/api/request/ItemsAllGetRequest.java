package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemsAllGetResponse;

/**
 * TOP API: taobao.items.all.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class ItemsAllGetRequest extends BaseTaobaoRequest<ItemsAllGetResponse> {
	
	

	/** 
	* 商品类目ID。ItemCat中的cid。可以通过taobao.itemcats.get取到
	 */
	private Long cid;

	/** 
	* 需返回的字段列表。可选值：Item商品结构体中的以下字段： 
approve_status,num_iid,title,nick,type,cid,pic_path,num,props,valid_thru, 
list_time,price,has_discount,has_invoice,has_warranty,has_showcase, 
modified,delist_time,postage_id,seller_cids,outer_id；字段之间用“,”分隔。 
不支持其他字段，如果需要获取其他字段数据，调用taobao.item.get。
	 */
	private String fields;

	/** 
	* 排序方式。格式为column:asc/desc ，column可选值:list_time(上架时间),delist_time(下架时间),num(商品数量);默认上架时间降序(即最新上架排在前面)。如按照上架时间降序排序方式为list_time:desc
	 */
	private String orderBy;

	/** 
	* 页码。取值范围:大于零的整数;默认值为1，即返回第一页数据。
用此接口获取数据，当翻页获取的条数（page_no*page_size）超过10万条,为了保护后台搜索引擎，接口将报错。请大家尽可能的细化自己的搜索条件，或者转调taobao.items.onsale.get和taobao.items.inventory.get根据修改时间分段获取商品
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于零的整数;最大值：200；默认值：40。
	 */
	private Long pageSize;

	/** 
	* 搜索字段。搜索商品的title。
	 */
	private String q;

	/** 
	* 卖家店铺内自定义类目ID。多个之间用“,”分隔。可以根据taobao.sellercats.list.get获得
	 */
	private String sellerCids;

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getQ() {
		return this.q;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}

	public String getApiMethodName() {
		return "taobao.items.all.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("fields", this.fields);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("q", this.q);
		txtParams.put("seller_cids", this.sellerCids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemsAllGetResponse> getResponseClass() {
		return ItemsAllGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(cid, 0L, "cid");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxValue(pageNo, 600L, "pageNo");
	}
	

}
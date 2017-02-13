package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.WlbItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4215852278455317979L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("item_list")
	@ApiField("wlb_item")
	private List<WlbItem> itemList;

	/** 
	 * 结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setItemList(List<WlbItem> itemList) {
		this.itemList = itemList;
	}
	public List<WlbItem> getItemList( ) {
		return this.itemList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}

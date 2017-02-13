package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ScItemMap;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.map.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemMapQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7356377356957759646L;

	/** 
	 * 后端商品映射列表
	 */
	@ApiListField("sc_item_maps")
	@ApiField("sc_item_map")
	private List<ScItemMap> scItemMaps;


	public void setScItemMaps(List<ScItemMap> scItemMaps) {
		this.scItemMaps = scItemMaps;
	}
	public List<ScItemMap> getScItemMaps( ) {
		return this.scItemMaps;
	}
	


}

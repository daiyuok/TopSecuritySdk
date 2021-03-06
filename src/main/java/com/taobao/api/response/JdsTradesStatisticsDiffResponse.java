package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jds.trades.statistics.diff response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JdsTradesStatisticsDiffResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6319451966287961217L;

	/** 
	 * pre_status比post_status多的tid列表
	 */
	@ApiListField("tids")
	@ApiField("number")
	private List<Long> tids;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setTids(List<Long> tids) {
		this.tids = tids;
	}
	public List<Long> getTids( ) {
		return this.tids;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

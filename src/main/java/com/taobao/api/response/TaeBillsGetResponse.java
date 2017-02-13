package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.BillDto;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tae.bills.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TaeBillsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1895257494224783455L;

	/** 
	 * 账单列表
	 */
	@ApiListField("bills")
	@ApiField("bill_dto")
	private List<BillDto> bills;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 当前页查询返回的结果数(0-100)。相同的查询时间段条件下，最大只能获取总共5000条记录。所以当大于等于5000时 ISV可以通过start_time及end_time来进行拆分，以保证可以查询到全部数据
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setBills(List<BillDto> bills) {
		this.bills = bills;
	}
	public List<BillDto> getBills( ) {
		return this.bills;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TopAcctCashJourDto;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tae.book.bills.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TaeBookBillsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5217991515115512167L;

	/** 
	 * 虚拟账户账单列表
	 */
	@ApiListField("bills")
	@ApiField("top_acct_cash_jour_dto")
	private List<TopAcctCashJourDto> bills;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 当前查询的结果数,非总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setBills(List<TopAcctCashJourDto> bills) {
		this.bills = bills;
	}
	public List<TopAcctCashJourDto> getBills( ) {
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

package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.TradeRecord;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.user.trade.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayUserTradeSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1248438278949378224L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private String totalResults;

	/** 
	 * 交易记录列表
	 */
	@ApiListField("trade_records")
	@ApiField("trade_record")
	private List<TradeRecord> tradeRecords;


	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeRecords(List<TradeRecord> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}
	public List<TradeRecord> getTradeRecords( ) {
		return this.tradeRecords;
	}
	


}

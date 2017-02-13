package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TaeBillsGetResponse;

/**
 * TOP API: taobao.tae.bills.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.09
 */
public class TaeBillsGetRequest extends BaseTaobaoRequest<TaeBillsGetResponse> {
	
	

	/** 
	* 页数,建议不要超过100页,越大性能越低,有可能会超时
	 */
	private Long currentPage;

	/** 
	* 传入需要返回的字段,参见Bill结构体
	 */
	private String fields;

	/** 
	* 科目编号
	 */
	private Long itemId;

	/** 
	* 交易编号
	 */
	private Long pTradeId;

	/** 
	* 每页大小,默认40条,可选范围 ：40~100
	 */
	private Long pageSize;

	/** 
	* 查询条件中的时间类型:1-交易订单完成时间biz_time 2-支付宝扣款时间pay_time 如果不填默认为2即根据支付时间查询,查询的结果会根据该时间倒排序
	 */
	private Long queryDateType;

	/** 
	* 结束时间,限制:结束时间-开始时间不能大于1天(根据order_id或者trade_id查询除外)
	 */
	private Date queryEndDate;

	/** 
	* 开始时间
	 */
	private Date queryStartDate;

	/** 
	* 子订单编号
	 */
	private Long tradeId;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setpTradeId(Long pTradeId) {
		this.pTradeId = pTradeId;
	}

	public Long getpTradeId() {
		return this.pTradeId;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setQueryDateType(Long queryDateType) {
		this.queryDateType = queryDateType;
	}

	public Long getQueryDateType() {
		return this.queryDateType;
	}

	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
	}

	public Date getQueryEndDate() {
		return this.queryEndDate;
	}

	public void setQueryStartDate(Date queryStartDate) {
		this.queryStartDate = queryStartDate;
	}

	public Date getQueryStartDate() {
		return this.queryStartDate;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public Long getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "taobao.tae.bills.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
		txtParams.put("fields", this.fields);
		txtParams.put("item_id", this.itemId);
		txtParams.put("p_trade_id", this.pTradeId);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("query_date_type", this.queryDateType);
		txtParams.put("query_end_date", this.queryEndDate);
		txtParams.put("query_start_date", this.queryStartDate);
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TaeBillsGetResponse> getResponseClass() {
		return TaeBillsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(queryEndDate, "queryEndDate");
		RequestCheckUtils.checkNotEmpty(queryStartDate, "queryStartDate");
	}
	

}
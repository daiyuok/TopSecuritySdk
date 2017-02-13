package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.TopAccountDto;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tae.accounts.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TaeAccountsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7886355665489317721L;

	/** 
	 * 返回的科目信息
	 */
	@ApiListField("accounts")
	@ApiField("top_account_dto")
	private List<TopAccountDto> accounts;

	/** 
	 * 返回记录行数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setAccounts(List<TopAccountDto> accounts) {
		this.accounts = accounts;
	}
	public List<TopAccountDto> getAccounts( ) {
		return this.accounts;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

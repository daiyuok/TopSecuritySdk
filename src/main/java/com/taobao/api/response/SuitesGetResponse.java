package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Suite;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.suites.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SuitesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1142333254485924824L;

	/** 
	 * 获取的套餐信息列表
	 */
	@ApiListField("suites")
	@ApiField("suite")
	private List<Suite> suites;

	/** 
	 * 获取到的套餐信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setSuites(List<Suite> suites) {
		this.suites = suites;
	}
	public List<Suite> getSuites( ) {
		return this.suites;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

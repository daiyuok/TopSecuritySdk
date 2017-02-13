package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Reason;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.refusereason.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundRefusereasonGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6429859748355469843L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 卖家拒绝原因对象
	 */
	@ApiListField("reasons")
	@ApiField("reason")
	private List<Reason> reasons;

	/** 
	 * 原因个数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setReasons(List<Reason> reasons) {
		this.reasons = reasons;
	}
	public List<Reason> getReasons( ) {
		return this.reasons;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

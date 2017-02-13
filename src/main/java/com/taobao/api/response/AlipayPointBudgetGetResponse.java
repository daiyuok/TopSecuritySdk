package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.point.budget.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayPointBudgetGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4561251148982867597L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;


	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.service.getServTimes response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasServiceGetServTimesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8164773817515991442L;

	/** 
	 * 剩余次数（容量）
	 */
	@ApiField("left_num")
	private Long leftNum;

	/** 
	 * 总次数（容量）
	 */
	@ApiField("total_num")
	private Long totalNum;


	public void setLeftNum(Long leftNum) {
		this.leftNum = leftNum;
	}
	public Long getLeftNum( ) {
		return this.leftNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}
	


}

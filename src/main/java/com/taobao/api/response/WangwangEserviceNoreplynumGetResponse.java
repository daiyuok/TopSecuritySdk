package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.NonReplyStatOnDay;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.noreplynum.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangEserviceNoreplynumGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5628518776426765453L;

	/** 
	 * 未回复统计列表
	 */
	@ApiListField("non_reply_stat_on_days")
	@ApiField("non_reply_stat_on_day")
	private List<NonReplyStatOnDay> nonReplyStatOnDays;


	public void setNonReplyStatOnDays(List<NonReplyStatOnDay> nonReplyStatOnDays) {
		this.nonReplyStatOnDays = nonReplyStatOnDays;
	}
	public List<NonReplyStatOnDay> getNonReplyStatOnDays( ) {
		return this.nonReplyStatOnDays;
	}
	


}

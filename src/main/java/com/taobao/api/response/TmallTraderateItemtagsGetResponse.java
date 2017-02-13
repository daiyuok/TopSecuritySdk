package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TmallRateTagDetail;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.traderate.itemtags.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallTraderateItemtagsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1298931666972463871L;

	/** 
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("tmall_rate_tag_detail")
	private List<TmallRateTagDetail> tags;


	public void setTags(List<TmallRateTagDetail> tags) {
		this.tags = tags;
	}
	public List<TmallRateTagDetail> getTags( ) {
		return this.tags;
	}
	


}

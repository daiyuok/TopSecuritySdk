package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.tag.items.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenTagItemsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5328684182759647611L;

	/** 
	 * flag
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * itemIds
	 */
	@ApiListField("item_ids")
	@ApiField("number")
	private List<Long> itemIds;

	/** 
	 * message
	 */
	@ApiField("message")
	private String message;

	/** 
	 * tagType
	 */
	@ApiField("tag_type")
	private String tagType;


	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setItemIds(List<Long> itemIds) {
		this.itemIds = itemIds;
	}
	public List<Long> getItemIds( ) {
		return this.itemIds;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}
	public String getTagType( ) {
		return this.tagType;
	}
	


}

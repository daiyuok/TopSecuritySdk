package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.items.tag.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenItemsTagQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8654882918175774929L;

	/** 
	 * flag
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * itemTags
	 */
	@ApiListField("item_tags")
	@ApiField("item_tag")
	private List<ItemTag> itemTags;

	/** 
	 * message
	 */
	@ApiField("message")
	private String message;


	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setItemTags(List<ItemTag> itemTags) {
		this.itemTags = itemTags;
	}
	public List<ItemTag> getItemTags( ) {
		return this.itemTags;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}
	
	/**
 * itemTags
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ItemTag extends TaobaoObject {

	private static final long serialVersionUID = 2542196379923288794L;

	/**
		 * itemId
		 */
		@ApiField("item_id")
		private Long itemId;
		/**
		 * tagType
		 */
		@ApiField("tag_type")
		private String tagType;
	

	public Long getItemId() {
			return this.itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
		public String getTagType() {
			return this.tagType;
		}
		public void setTagType(String tagType) {
			this.tagType = tagType;
		}

}



}

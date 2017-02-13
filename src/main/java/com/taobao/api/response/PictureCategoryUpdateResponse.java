package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.category.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureCategoryUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7463655367663547836L;

	/** 
	 * 更新图片分类是否成功
	 */
	@ApiField("done")
	private Boolean done;


	public void setDone(Boolean done) {
		this.done = done;
	}
	public Boolean getDone( ) {
		return this.done;
	}
	


}

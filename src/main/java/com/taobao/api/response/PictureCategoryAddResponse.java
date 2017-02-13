package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PictureCategory;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.category.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureCategoryAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1722611587758685368L;

	/** 
	 * 图片分类信息
	 */
	@ApiField("picture_category")
	private PictureCategory pictureCategory;


	public void setPictureCategory(PictureCategory pictureCategory) {
		this.pictureCategory = pictureCategory;
	}
	public PictureCategory getPictureCategory( ) {
		return this.pictureCategory;
	}
	


}

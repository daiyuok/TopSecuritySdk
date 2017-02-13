package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PropertyInputDO;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.brandcat.propinput.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallBrandcatPropinputGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4689283665129248385L;

	/** 
	 * 属性输入特征
	 */
	@ApiField("property_input")
	private PropertyInputDO propertyInput;


	public void setPropertyInput(PropertyInputDO propertyInput) {
		this.propertyInput = propertyInput;
	}
	public PropertyInputDO getPropertyInput( ) {
		return this.propertyInput;
	}
	


}

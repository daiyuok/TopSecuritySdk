package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.serialno.batch.generate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceSerialnoBatchGenerateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4127574261231266994L;

	/** 
	 * result
	 */
	@ApiListField("serial_no_list")
	@ApiField("string")
	private List<String> serialNoList;


	public void setSerialNoList(List<String> serialNoList) {
		this.serialNoList = serialNoList;
	}
	public List<String> getSerialNoList( ) {
		return this.serialNoList;
	}
	


}

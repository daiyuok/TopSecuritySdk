package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.ipout.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopIpoutGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3268487556831126626L;

	/** 
	 * TOP网关出口IP列表
	 */
	@ApiListField("ip_list")
	@ApiField("string")
	private List<String> ipList;


	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}
	public List<String> getIpList( ) {
		return this.ipList;
	}
	


}

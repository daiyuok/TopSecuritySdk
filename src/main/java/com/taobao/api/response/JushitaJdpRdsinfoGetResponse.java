package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RdsConfig;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.rdsinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpRdsinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1731642361397628844L;

	/** 
	 * app的rds列表
	 */
	@ApiListField("rds_list")
	@ApiField("rds_config")
	private List<RdsConfig> rdsList;


	public void setRdsList(List<RdsConfig> rdsList) {
		this.rdsList = rdsList;
	}
	public List<RdsConfig> getRdsList( ) {
		return this.rdsList;
	}
	


}

package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.AccountInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.accountstatus.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangEserviceAccountstatusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5477154426315642277L;

	/** 
	 * 账号操作记录列表。
	 */
	@ApiListField("account_infos")
	@ApiField("account_info")
	private List<AccountInfo> accountInfos;

	/** 
	 * 接口调用返回码。 0：成功。100：部分成功。
	 */
	@ApiField("ret_code")
	private Long retCode;


	public void setAccountInfos(List<AccountInfo> accountInfos) {
		this.accountInfos = accountInfos;
	}
	public List<AccountInfo> getAccountInfos( ) {
		return this.accountInfos;
	}

	public void setRetCode(Long retCode) {
		this.retCode = retCode;
	}
	public Long getRetCode( ) {
		return this.retCode;
	}
	


}

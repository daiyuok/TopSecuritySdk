package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayUserAccountFreezeGetResponse;

/**
 * TOP API: alipay.user.account.freeze.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.05.27
 */
public class AlipayUserAccountFreezeGetRequest extends BaseTaobaoRequest<AlipayUserAccountFreezeGetResponse> {
	
	

	/** 
	* 冻结类型，多个用,分隔。不传返回所有类型的冻结金额。
DEPOSIT_FREEZE,充值冻结
WITHDRAW_FREEZE,提现冻结
PAYMENT_FREEZE,支付冻结
BAIL_FREEZE,保证金冻结
CHARGE_FREEZE,收费冻结
PRE_DEPOSIT_FREEZE,预存款冻结
LOAN_FREEZE,贷款冻结
OTHER_FREEZE,其它
	 */
	private String freezeType;

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

	public String getFreezeType() {
		return this.freezeType;
	}

	public String getApiMethodName() {
		return "alipay.user.account.freeze.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("freeze_type", this.freezeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayUserAccountFreezeGetResponse> getResponseClass() {
		return AlipayUserAccountFreezeGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
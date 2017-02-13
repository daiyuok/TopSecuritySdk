package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillDistributeInfoRequest extends TaobaoObject {

	private static final long serialVersionUID = 2414473515286731455L;

	/**
	 * 地址对信息
	 */
	@ApiListField("address_pairs")
	@ApiField("address_pair")
	private List<AddressPair> addressPairs;

	/**
	 * appkey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 快递服务商编码
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 快递服务商id
	 */
	@ApiField("cp_id")
	private Long cpId;


	public List<AddressPair> getAddressPairs() {
		return this.addressPairs;
	}
	public void setAddressPairs(List<AddressPair> addressPairs) {
		this.addressPairs = addressPairs;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public Long getCpId() {
		return this.cpId;
	}
	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}

}

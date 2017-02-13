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
public class WaybillDistributeInfoResponse extends TaobaoObject {

	private static final long serialVersionUID = 1547469697611368565L;

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

	/**
	 * 分拣信息列表
	 */
	@ApiListField("waybill_distribute_infos")
	@ApiField("waybill_distribute_info")
	private List<WaybillDistributeInfo> waybillDistributeInfos;


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

	public List<WaybillDistributeInfo> getWaybillDistributeInfos() {
		return this.waybillDistributeInfos;
	}
	public void setWaybillDistributeInfos(List<WaybillDistributeInfo> waybillDistributeInfos) {
		this.waybillDistributeInfos = waybillDistributeInfos;
	}

}

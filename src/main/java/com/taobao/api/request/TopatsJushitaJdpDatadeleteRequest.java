package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TopatsJushitaJdpDatadeleteResponse;

/**
 * TOP API: taobao.topats.jushita.jdp.datadelete request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.31
 */
public class TopatsJushitaJdpDatadeleteRequest extends BaseTaobaoRequest<TopatsJushitaJdpDatadeleteResponse> {
	
	

	/** 
	* 删除数据时间段的结束修改时间，格式为：yyyy-MM-dd HH:mm:ss，结束时间必须为前天的23:59:59秒以前，根据是业务的modified时间
	 */
	private Date endDate;

	/** 
	* 删除数据时间段的起始修改时间，格式为：yyyy-MM-dd HH:mm:ss,根据是业务的modified时间
	 */
	private Date startDate;

	/** 
	* 推送的数据类型，可选值为：tb_trade(淘宝交易)，tb_item(淘宝商品)，tb_refund(淘宝退款)，fx_trade(分销订单)，同时删除多种类型以分号分隔，如："tb_trade;tb_item;tb_refund;fx_trade"
	 */
	private String syncTypes;

	/** 
	* 用户昵称，不填表示删除所有用户的数据。
	 */
	private String userNick;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setSyncTypes(String syncTypes) {
		this.syncTypes = syncTypes;
	}

	public String getSyncTypes() {
		return this.syncTypes;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.topats.jushita.jdp.datadelete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("start_date", this.startDate);
		txtParams.put("sync_types", this.syncTypes);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopatsJushitaJdpDatadeleteResponse> getResponseClass() {
		return TopatsJushitaJdpDatadeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
		RequestCheckUtils.checkNotEmpty(syncTypes, "syncTypes");
	}
	

}
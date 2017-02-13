package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangEserviceReceivenumGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.receivenum.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.03.18
 */
public class WangwangEserviceReceivenumGetRequest extends BaseTaobaoRequest<WangwangEserviceReceivenumGetResponse> {
	
	

	/** 
	* 查询接待人数的结束日期 时间精确到日 时分秒可以直接传00:00:00
	 */
	private Date endDate;

	/** 
	* 客服人员id：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String serviceStaffId;

	/** 
	* 查询接待人数的开始日期 时间精确到日 时分秒可直接传 00:00:00
	 */
	private Date startDate;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.receivenum.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("service_staff_id", this.serviceStaffId);
		txtParams.put("start_date", this.startDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangEserviceReceivenumGetResponse> getResponseClass() {
		return WangwangEserviceReceivenumGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(serviceStaffId, "serviceStaffId");
		RequestCheckUtils.checkMaxLength(serviceStaffId, 1900, "serviceStaffId");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}
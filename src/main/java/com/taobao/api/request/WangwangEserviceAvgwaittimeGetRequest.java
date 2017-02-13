package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangEserviceAvgwaittimeGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.avgwaittime.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.03.18
 */
public class WangwangEserviceAvgwaittimeGetRequest extends BaseTaobaoRequest<WangwangEserviceAvgwaittimeGetResponse> {
	
	

	/** 
	* 结束时间
	 */
	private Date endDate;

	/** 
	* 客服人员id：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String serviceStaffId;

	/** 
	* 开始时间
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
		return "taobao.wangwang.eservice.avgwaittime.get";
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

	public Class<WangwangEserviceAvgwaittimeGetResponse> getResponseClass() {
		return WangwangEserviceAvgwaittimeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(serviceStaffId, "serviceStaffId");
		RequestCheckUtils.checkMaxLength(serviceStaffId, 1900, "serviceStaffId");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}
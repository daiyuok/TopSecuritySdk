package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceCreateResultsIncrementGetResponse;

/**
 * TOP API: alibaba.einvoice.create.results.increment.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.09
 */
public class AlibabaEinvoiceCreateResultsIncrementGetRequest extends BaseTaobaoRequest<AlibabaEinvoiceCreateResultsIncrementGetResponse> {
	
	

	/** 
	* 终止查询时间
	 */
	private Date endModified;

	/** 
	* 显示的页码
	 */
	private Long pageNo;

	/** 
	* 页面大小(不能超过200)
	 */
	private Long pageSize;

	/** 
	* 收款方税务登记证号
	 */
	private String payeeRegisterNo;

	/** 
	* 起始查询时间
	 */
	private Date startModified;

	/** 
	* 开票状态 (waiting = 开票中) 、(create_success = 开票成功)、(create_failed = 开票失败)
	 */
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public Date getEndModified() {
		return this.endModified;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public Date getStartModified() {
		return this.startModified;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.create.results.increment.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceCreateResultsIncrementGetResponse> getResponseClass() {
		return AlibabaEinvoiceCreateResultsIncrementGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endModified, "endModified");
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
		RequestCheckUtils.checkNotEmpty(startModified, "startModified");
	}
	

}
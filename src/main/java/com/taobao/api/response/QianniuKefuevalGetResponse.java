package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.kefueval.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuKefuevalGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7861169577827167143L;

	/** 
	 * resultCount
	 */
	@ApiField("result_count")
	private Long resultCount;

	/** 
	 * staffEvalDetails
	 */
	@ApiListField("staff_eval_details")
	@ApiField("eval_detail")
	private List<EvalDetail> staffEvalDetails;


	public void setResultCount(Long resultCount) {
		this.resultCount = resultCount;
	}
	public Long getResultCount( ) {
		return this.resultCount;
	}

	public void setStaffEvalDetails(List<EvalDetail> staffEvalDetails) {
		this.staffEvalDetails = staffEvalDetails;
	}
	public List<EvalDetail> getStaffEvalDetails( ) {
		return this.staffEvalDetails;
	}
	
	/**
 * staffEvalDetails
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class EvalDetail extends TaobaoObject {

	private static final long serialVersionUID = 7883563474828457951L;

	/**
		 * evalCode
		 */
		@ApiField("eval_code")
		private Long evalCode;
		/**
		 * evalRecer
		 */
		@ApiField("eval_recer")
		private String evalRecer;
		/**
		 * evalSender
		 */
		@ApiField("eval_sender")
		private String evalSender;
		/**
		 * evalTime
		 */
		@ApiField("eval_time")
		private Date evalTime;
		/**
		 * sendTime
		 */
		@ApiField("send_time")
		private Date sendTime;
	

	public Long getEvalCode() {
			return this.evalCode;
		}
		public void setEvalCode(Long evalCode) {
			this.evalCode = evalCode;
		}
		public String getEvalRecer() {
			return this.evalRecer;
		}
		public void setEvalRecer(String evalRecer) {
			this.evalRecer = evalRecer;
		}
		public String getEvalSender() {
			return this.evalSender;
		}
		public void setEvalSender(String evalSender) {
			this.evalSender = evalSender;
		}
		public Date getEvalTime() {
			return this.evalTime;
		}
		public void setEvalTime(Date evalTime) {
			this.evalTime = evalTime;
		}
		public Date getSendTime() {
			return this.sendTime;
		}
		public void setSendTime(Date sendTime) {
			this.sendTime = sendTime;
		}

}



}

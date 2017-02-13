package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCbossWorkplatformOperationReplyResponse;

/**
 * TOP API: cainiao.cboss.workplatform.operation.reply request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.14
 */
public class CainiaoCbossWorkplatformOperationReplyRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformOperationReplyResponse> {
	
	

	/** 
	* 任务操作时间
	 */
	private Date actionTime;

	/** 
	* 任务操作类型
	 */
	private Long actionType;

	/** 
	* 凭证照片地址拼接
	 */
	private String attachPath;

	/** 
	* 操作者联系方式
	 */
	private String dealerContact;

	/** 
	* 操作者userId
	 */
	private String dealerUserId;

	/** 
	* 扩展字段
	 */
	private String features;

	/** 
	* 商家工单操作回传备注
	 */
	private String memo;

	/** 
	* 工单任务id
	 */
	private String taskId;

	/** 
	* 工单id
	 */
	private String workOrderId;

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public Date getActionTime() {
		return this.actionTime;
	}

	public void setActionType(Long actionType) {
		this.actionType = actionType;
	}

	public Long getActionType() {
		return this.actionType;
	}

	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}

	public String getAttachPath() {
		return this.attachPath;
	}

	public void setDealerContact(String dealerContact) {
		this.dealerContact = dealerContact;
	}

	public String getDealerContact() {
		return this.dealerContact;
	}

	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}

	public String getDealerUserId() {
		return this.dealerUserId;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getFeatures() {
		return this.features;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.operation.reply";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action_time", this.actionTime);
		txtParams.put("action_type", this.actionType);
		txtParams.put("attach_path", this.attachPath);
		txtParams.put("dealer_contact", this.dealerContact);
		txtParams.put("dealer_user_id", this.dealerUserId);
		txtParams.put("features", this.features);
		txtParams.put("memo", this.memo);
		txtParams.put("task_id", this.taskId);
		txtParams.put("work_order_id", this.workOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformOperationReplyResponse> getResponseClass() {
		return CainiaoCbossWorkplatformOperationReplyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
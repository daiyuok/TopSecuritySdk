package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpTasksGetResponse;

/**
 * TOP API: taobao.jushita.jdp.tasks.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.15
 */
public class JushitaJdpTasksGetRequest extends BaseTaobaoRequest<JushitaJdpTasksGetResponse> {
	
	

	/** 
	* 最大可返回的任务数量
	 */
	private Long fetchNum;

	/** 
	* 普通isv不能传入此参数
	 */
	private String targetAppkey;

	/** 
	* 任务分组数量，表示把所有任务平均分成x组，在线订购应用此参数必传；非在线订购应用此参数忽略。
	 */
	private Long taskItemNum;

	/** 
	* 指定获取哪些分组的任务，取多个分组有半角逗号分隔，在线订购应用此参数必传；非在线订购应用此参数忽略。其中task_items >= 0且task_items < task_item_num
	 */
	private String taskItems;

	/** 
	* 任务类型
	 */
	private Long type;

	/** 
	* 需要查询哪些用户的任务，非在线订购应用此参数必传；在线订购应用此参数忽略。
	 */
	private String userIds;

	public void setFetchNum(Long fetchNum) {
		this.fetchNum = fetchNum;
	}

	public Long getFetchNum() {
		return this.fetchNum;
	}

	public void setTargetAppkey(String targetAppkey) {
		this.targetAppkey = targetAppkey;
	}

	public String getTargetAppkey() {
		return this.targetAppkey;
	}

	public void setTaskItemNum(Long taskItemNum) {
		this.taskItemNum = taskItemNum;
	}

	public Long getTaskItemNum() {
		return this.taskItemNum;
	}

	public void setTaskItems(String taskItems) {
		this.taskItems = taskItems;
	}

	public String getTaskItems() {
		return this.taskItems;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.tasks.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fetch_num", this.fetchNum);
		txtParams.put("target_appkey", this.targetAppkey);
		txtParams.put("task_item_num", this.taskItemNum);
		txtParams.put("task_items", this.taskItems);
		txtParams.put("type", this.type);
		txtParams.put("user_ids", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpTasksGetResponse> getResponseClass() {
		return JushitaJdpTasksGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(fetchNum, 200L, "fetchNum");
		RequestCheckUtils.checkMinValue(fetchNum, 1L, "fetchNum");
		RequestCheckUtils.checkMinValue(taskItemNum, 1L, "taskItemNum");
		RequestCheckUtils.checkMaxListSize(taskItems, 500, "taskItems");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkMinValue(type, 0L, "type");
		RequestCheckUtils.checkMaxListSize(userIds, 200, "userIds");
	}
	

}
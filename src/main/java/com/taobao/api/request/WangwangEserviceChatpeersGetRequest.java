package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangEserviceChatpeersGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatpeers.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.17
 */
public class WangwangEserviceChatpeersGetRequest extends BaseTaobaoRequest<WangwangEserviceChatpeersGetResponse> {
	
	

	/** 
	* 字符集
	 */
	private String charset;

	/** 
	* 聊天用户ID：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String chatId;

	/** 
	* 查询结束日期。如2010-03-24，与起始日期跨度不能超过7天
	 */
	private String endDate;

	/** 
	* 查询起始日期。如2010-02-01，与当前日期间隔小于1个月。
	 */
	private String startDate;

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getCharset() {
		return this.charset;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.chatpeers.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charset", this.charset);
		txtParams.put("chat_id", this.chatId);
		txtParams.put("end_date", this.endDate);
		txtParams.put("start_date", this.startDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangEserviceChatpeersGetResponse> getResponseClass() {
		return WangwangEserviceChatpeersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatId, "chatId");
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}
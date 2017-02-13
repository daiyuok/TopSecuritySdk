package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WangwangEserviceChatrelationGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatrelation.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.04
 */
public class WangwangEserviceChatrelationGetRequest extends BaseTaobaoRequest<WangwangEserviceChatrelationGetResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String chatRelationRequest;

	public void setChatRelationRequest(String chatRelationRequest) {
		this.chatRelationRequest = chatRelationRequest;
	}

	public void setChatRelationRequest(ChatRelationRequest chatRelationRequest) {
		this.chatRelationRequest = new JSONWriter(false,true).write(chatRelationRequest);
	}

	public String getChatRelationRequest() {
		return this.chatRelationRequest;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.chatrelation.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chat_relation_request", this.chatRelationRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangEserviceChatrelationGetResponse> getResponseClass() {
		return WangwangEserviceChatrelationGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 请求参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ChatRelationRequest extends TaobaoObject {

	private static final long serialVersionUID = 4487235623633669643L;

	/**
		 * 查询起始时间（精度到天）
		 */
		@ApiField("beg")
		private Date beg;
		/**
		 * 查询条数
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 查询结束时间（精度到天）
		 */
		@ApiField("end")
		private Date end;
		/**
		 * 翻页查询起始key
		 */
		@ApiField("page_beg")
		private String pageBeg;
		/**
		 * 翻页查询结束key
		 */
		@ApiField("page_end")
		private String pageEnd;
		/**
		 * 查询账号
		 */
		@ApiField("uid")
		private String uid;
	

	public Date getBeg() {
			return this.beg;
		}
		public void setBeg(Date beg) {
			this.beg = beg;
		}
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Date getEnd() {
			return this.end;
		}
		public void setEnd(Date end) {
			this.end = end;
		}
		public String getPageBeg() {
			return this.pageBeg;
		}
		public void setPageBeg(String pageBeg) {
			this.pageBeg = pageBeg;
		}
		public String getPageEnd() {
			return this.pageEnd;
		}
		public void setPageEnd(String pageEnd) {
			this.pageEnd = pageEnd;
		}
		public String getUid() {
			return this.uid;
		}
		public void setUid(String uid) {
			this.uid = uid;
		}

}


}
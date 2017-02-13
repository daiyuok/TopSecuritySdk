package com.taobao.api.response;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatrelation.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangEserviceChatrelationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6714333161314843525L;

	/** 
	 * result
	 */
	@ApiField("result")
	private ChatRelationResult result;


	public void setResult(ChatRelationResult result) {
		this.result = result;
	}
	public ChatRelationResult getResult( ) {
		return this.result;
	}
	
	/**
 * 关系列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ChatPeer extends TaobaoObject {

	private static final long serialVersionUID = 3641844214341915961L;

	/**
		 * 时间
		 */
		@ApiField("date")
		private Date date;
		/**
		 * 账号。长ID
		 */
		@ApiField("uid")
		private String uid;
	

	public Date getDate() {
			return this.date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getUid() {
			return this.uid;
		}
		public void setUid(String uid) {
			this.uid = uid;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ChatRelationResult extends TaobaoObject {

	private static final long serialVersionUID = 7463493779332472717L;

	/**
		 * 返回码
		 */
		@ApiField("code")
		private Long code;
		/**
		 * 结束key。如果该值为空，则表示请求时间区间内的数据已经拿完。否则，表示区间内还有数据，可以将该值作为下次请求条件的page_beg传入进行迭代请求。
		 */
		@ApiField("end_key")
		private String endKey;
		/**
		 * 关系列表
		 */
		@ApiListField("peers")
		@ApiField("chat_peer")
		private List<ChatPeer> peers;
		/**
		 * 错误原因
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 起始key。如果要实现上翻页，可以将该值作为下次请求的page_end
		 */
		@ApiField("start_key")
		private String startKey;
	

	public Long getCode() {
			return this.code;
		}
		public void setCode(Long code) {
			this.code = code;
		}
		public String getEndKey() {
			return this.endKey;
		}
		public void setEndKey(String endKey) {
			this.endKey = endKey;
		}
		public List<ChatPeer> getPeers() {
			return this.peers;
		}
		public void setPeers(List<ChatPeer> peers) {
			this.peers = peers;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getStartKey() {
			return this.startKey;
		}
		public void setStartKey(String startKey) {
			this.startKey = startKey;
		}

}



}

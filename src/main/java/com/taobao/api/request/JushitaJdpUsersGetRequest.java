package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJdpUsersGetResponse;

/**
 * TOP API: taobao.jushita.jdp.users.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.29
 */
public class JushitaJdpUsersGetRequest extends BaseTaobaoRequest<JushitaJdpUsersGetResponse> {
	
	

	/** 
	* 此参数一般不用传，用于查询最后更改时间在某个时间段内的用户
	 */
	private Date endModified;

	/** 
	* 当前页数
	 */
	private Long pageNo;

	/** 
	* 每页记录数，默认200
	 */
	private Long pageSize;

	/** 
	* 此参数一般不用传，用于查询最后更改时间在某个时间段内的用户
	 */
	private Date startModified;

	/** 
	* 普通isv不能传入此参数
	 */
	private String targetAppkey;

	/** 
	* 如果传了user_id表示单条查询
	 */
	private Long userId;

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

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public Date getStartModified() {
		return this.startModified;
	}

	public void setTargetAppkey(String targetAppkey) {
		this.targetAppkey = targetAppkey;
	}

	public String getTargetAppkey() {
		return this.targetAppkey;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.users.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("target_appkey", this.targetAppkey);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpUsersGetResponse> getResponseClass() {
		return JushitaJdpUsersGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
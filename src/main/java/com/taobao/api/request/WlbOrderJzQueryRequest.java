package com.taobao.api.request;

import com.taobao.api.domain.JzReceiverTo;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbOrderJzQueryResponse;

/**
 * TOP API: taobao.wlb.order.jz.query request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.17
 */
public class WlbOrderJzQueryRequest extends BaseTaobaoRequest<WlbOrderJzQueryResponse> {
	
	

	/** 
	* 家装安装服务收货人信息
	 */
	private String insJzReceiverTO;

	/** 
	* 家装收货人信息
	 */
	private String jzReceiverTo;

	/** 
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。如果为空，取的卖家的默认取货地址
	 */
	private Long senderId;

	/** 
	* 交易id
	 */
	private Long tid;

	public void setInsJzReceiverTO(String insJzReceiverTO) {
		this.insJzReceiverTO = insJzReceiverTO;
	}

	public void setInsJzReceiverTO(JzReceiverTo insJzReceiverTO) {
		this.insJzReceiverTO = new JSONWriter(false,true).write(insJzReceiverTO);
	}

	public String getInsJzReceiverTO() {
		return this.insJzReceiverTO;
	}

	public void setJzReceiverTo(String jzReceiverTo) {
		this.jzReceiverTo = jzReceiverTo;
	}

	public void setJzReceiverTo(JzReceiverTo jzReceiverTo) {
		this.jzReceiverTo = new JSONWriter(false,true).write(jzReceiverTo);
	}

	public String getJzReceiverTo() {
		return this.jzReceiverTo;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getSenderId() {
		return this.senderId;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.jz.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ins_jz_receiver_t_o", this.insJzReceiverTO);
		txtParams.put("jz_receiver_to", this.jzReceiverTo);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderJzQueryResponse> getResponseClass() {
		return WlbOrderJzQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
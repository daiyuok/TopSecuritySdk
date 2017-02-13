package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WangwangEserviceAccountstatusGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.accountstatus.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.07.02
 */
public class WangwangEserviceAccountstatusGetRequest extends BaseTaobaoRequest<WangwangEserviceAccountstatusGetResponse> {
	
	

	/** 
	* 的起始时间。</br>
格式为： YYYY-mm-dd_HH:MM:SS </br>
注：</br>
1. 查询时间必须在30天之内。
2. 起始时间和结束时间间隔不超过7天。
	 */
	private String btime;

	/** 
	* 结束时间 。 </br>
格式为：YYYY-mm-dd_HH:MM:SS </br>
注：</br>
1. 查询时间必须在30天之内。
2. 起始时间和结束时间间隔不超过7天。
	 */
	private String etime;

	/** 
	* 查询账号（序列）。 需要带前缀（如cntaobao）。</br>

注： </br>
1. uid中所有账号必须为授权店铺的店铺内账号。</br>
2. 如果传入多个账号，账号与账号之间以","分割。最多30个账号。每个账号的最大长度是64。</br>
3. 由于后端依然是顺序请求，所以该接口的响应时长是会随uid的数量线性增长，即uid数量越多，调用时间越长。请合理使用
	 */
	private String uid;

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String getBtime() {
		return this.btime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getEtime() {
		return this.etime;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return this.uid;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.accountstatus.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("btime", this.btime);
		txtParams.put("etime", this.etime);
		txtParams.put("uid", this.uid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangEserviceAccountstatusGetResponse> getResponseClass() {
		return WangwangEserviceAccountstatusGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(btime, "btime");
		RequestCheckUtils.checkMaxLength(btime, 19, "btime");
		RequestCheckUtils.checkNotEmpty(etime, "etime");
		RequestCheckUtils.checkMaxLength(etime, 19, "etime");
		RequestCheckUtils.checkNotEmpty(uid, "uid");
		RequestCheckUtils.checkMaxListSize(uid, 30, "uid");
		RequestCheckUtils.checkMaxLength(uid, 1920, "uid");
	}
	

}
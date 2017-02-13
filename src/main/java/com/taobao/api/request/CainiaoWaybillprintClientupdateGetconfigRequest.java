package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoWaybillprintClientupdateGetconfigResponse;

/**
 * TOP API: cainiao.waybillprint.clientupdate.getconfig request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.09
 */
public class CainiaoWaybillprintClientupdateGetconfigRequest extends BaseTaobaoRequest<CainiaoWaybillprintClientupdateGetconfigResponse> {
	
	

	/** 
	* 服务发起机器局域网ip
	 */
	private String lanIp;

	/** 
	* 服务发起机器的物理地址
	 */
	private String mac;

	/** 
	* 当前消息版本
	 */
	private Long msgid;

	/** 
	* 当前打印客户端版本
	 */
	private String version;

	public void setLanIp(String lanIp) {
		this.lanIp = lanIp;
	}

	public String getLanIp() {
		return this.lanIp;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMsgid(Long msgid) {
		this.msgid = msgid;
	}

	public Long getMsgid() {
		return this.msgid;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "cainiao.waybillprint.clientupdate.getconfig";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("lan_ip", this.lanIp);
		txtParams.put("mac", this.mac);
		txtParams.put("msgid", this.msgid);
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillprintClientupdateGetconfigResponse> getResponseClass() {
		return CainiaoWaybillprintClientupdateGetconfigResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(lanIp, "lanIp");
		RequestCheckUtils.checkNotEmpty(mac, "mac");
		RequestCheckUtils.checkNotEmpty(msgid, "msgid");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaEinvoiceApplyGetResponse;

/**
 * TOP API: alibaba.einvoice.apply.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.23
 */
public class AlibabaEinvoiceApplyGetRequest extends BaseTaobaoRequest<AlibabaEinvoiceApplyGetResponse> {
	
	

	/** 
	* 开票申请ID，跟消息中的apply_id对应
	 */
	private String applyId;

	/** 
	* 电商平台代码。TB=淘宝 、TM=天猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ网购、AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1号店、VANCL=凡客、YL=邮乐、YG=优购、1688=阿里巴巴、POS=POS门店、OTHER=其他,  (只传英文编码)
	 */
	private String platformCode;

	/** 
	* 平台订单号
	 */
	private String platformTid;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyId() {
		return this.applyId;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.apply.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("apply_id", this.applyId);
		txtParams.put("platform_code", this.platformCode);
		txtParams.put("platform_tid", this.platformTid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceApplyGetResponse> getResponseClass() {
		return AlibabaEinvoiceApplyGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(applyId, "applyId");
		RequestCheckUtils.checkNotEmpty(platformCode, "platformCode");
		RequestCheckUtils.checkNotEmpty(platformTid, "platformTid");
	}
	

}
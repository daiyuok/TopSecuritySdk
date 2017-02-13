package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoCbossWorkplatformWorkorderCreateResponse;

/**
 * TOP API: cainiao.cboss.workplatform.workorder.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.22
 */
public class CainiaoCbossWorkplatformWorkorderCreateRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformWorkorderCreateResponse> {
	
	

	/** 
	* 凭证地址列表
	 */
	private String attachPathList;

	/** 
	* 外部业务系统主键
	 */
	private String bizEntityValue;

	/** 
	* 业务类型
	 */
	private String bizType;

	/** 
	* 创建者淘宝id（区分子账号）
	 */
	private String creatorId;

	/** 
	* 创建者角色
	 */
	private String creatorRole;

	/** 
	* 扩展字段
	 */
	private String features;

	/** 
	* 运单号
	 */
	private String mailNo;

	/** 
	* 货主商家用户id
	 */
	private String memberId;

	/** 
	* 货主用户角色
	 */
	private String memberRole;

	/** 
	* 工单创建备注
	 */
	private String memo;

	/** 
	* 店铺用户id
	 */
	private String shopUserId;

	/** 
	* 工单来源
	 */
	private String source;

	/** 
	* 来源签名，用于唯一区分不同的来源方
	 */
	private String sourceSign;

	/** 
	* 交易订单id
	 */
	private String tradeId;

	/** 
	* 工单类型
	 */
	private String workOrderType;

	public void setAttachPathList(String attachPathList) {
		this.attachPathList = attachPathList;
	}

	public String getAttachPathList() {
		return this.attachPathList;
	}

	public void setBizEntityValue(String bizEntityValue) {
		this.bizEntityValue = bizEntityValue;
	}

	public String getBizEntityValue() {
		return this.bizEntityValue;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorRole(String creatorRole) {
		this.creatorRole = creatorRole;
	}

	public String getCreatorRole() {
		return this.creatorRole;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getFeatures() {
		return this.features;
	}

	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getMailNo() {
		return this.mailNo;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}

	public String getMemberRole() {
		return this.memberRole;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setShopUserId(String shopUserId) {
		this.shopUserId = shopUserId;
	}

	public String getShopUserId() {
		return this.shopUserId;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setSourceSign(String sourceSign) {
		this.sourceSign = sourceSign;
	}

	public String getSourceSign() {
		return this.sourceSign;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public void setWorkOrderType(String workOrderType) {
		this.workOrderType = workOrderType;
	}

	public String getWorkOrderType() {
		return this.workOrderType;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.workorder.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("attach_path_list", this.attachPathList);
		txtParams.put("biz_entity_value", this.bizEntityValue);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("creator_id", this.creatorId);
		txtParams.put("creator_role", this.creatorRole);
		txtParams.put("features", this.features);
		txtParams.put("mail_no", this.mailNo);
		txtParams.put("member_id", this.memberId);
		txtParams.put("member_role", this.memberRole);
		txtParams.put("memo", this.memo);
		txtParams.put("shop_user_id", this.shopUserId);
		txtParams.put("source", this.source);
		txtParams.put("source_sign", this.sourceSign);
		txtParams.put("trade_id", this.tradeId);
		txtParams.put("work_order_type", this.workOrderType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformWorkorderCreateResponse> getResponseClass() {
		return CainiaoCbossWorkplatformWorkorderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(attachPathList, 20, "attachPathList");
	}
	

}
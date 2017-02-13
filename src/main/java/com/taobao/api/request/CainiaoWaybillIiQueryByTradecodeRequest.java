package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoWaybillIiQueryByTradecodeResponse;

/**
 * TOP API: cainiao.waybill.ii.query.by.tradecode request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.01
 */
public class CainiaoWaybillIiQueryByTradecodeRequest extends BaseTaobaoRequest<CainiaoWaybillIiQueryByTradecodeResponse> {
	
	

	/** 
	* 订单号列表
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<WaybillDetailQueryByBizSubCodeRequest> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.query.by.tradecode";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiQueryByTradecodeResponse> getResponseClass() {
		return CainiaoWaybillIiQueryByTradecodeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 10, "paramList");
	}
	
	/**
 * 订单号列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillDetailQueryByBizSubCodeRequest extends TaobaoObject {

	private static final long serialVersionUID = 7567212483754889914L;

	/**
		 * 订单号
		 */
		@ApiField("biz_sub_code")
		private String bizSubCode;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
	

	public String getBizSubCode() {
			return this.bizSubCode;
		}
		public void setBizSubCode(String bizSubCode) {
			this.bizSubCode = bizSubCode;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

}


}
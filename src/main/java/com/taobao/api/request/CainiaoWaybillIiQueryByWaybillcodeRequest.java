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
import com.taobao.api.response.CainiaoWaybillIiQueryByWaybillcodeResponse;

/**
 * TOP API: cainiao.waybill.ii.query.by.waybillcode request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.04
 */
public class CainiaoWaybillIiQueryByWaybillcodeRequest extends BaseTaobaoRequest<CainiaoWaybillIiQueryByWaybillcodeResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<WaybillDetailQueryByWaybillCodeRequest> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.query.by.waybillcode";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiQueryByWaybillcodeResponse> getResponseClass() {
		return CainiaoWaybillIiQueryByWaybillcodeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 20, "paramList");
	}
	
	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillDetailQueryByWaybillCodeRequest extends TaobaoObject {

	private static final long serialVersionUID = 4262111353543143745L;

	/**
		 * 快递公司code
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 电子面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}

}


}
package com.taobao.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OmniorderAllocatedinfoSyncResponse;

/**
 * TOP API: taobao.omniorder.allocatedinfo.sync request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.10
 */
public class OmniorderAllocatedinfoSyncRequest extends BaseTaobaoRequest<OmniorderAllocatedinfoSyncResponse> {
	
	

	/** 
	* 分单结果消息, 如果status为AllocateFail, 则表示失败的理由.
	 */
	private String message;

	/** 
	* 1231243213213
	 */
	private Long reportTimestamp;

	/** 
	* 分单状态，如： 等待中(Waiting)，已分单(Allocated)，分单失败(AllocateFail)
	 */
	private String status;

	/** 
	* 门店的分单列表
	 */
	private String subOrderList;

	/** 
	* 淘宝交易主订单ID
	 */
	private Long tid;

	/** 
	* 跟踪Id
	 */
	private String traceId;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setReportTimestamp(Long reportTimestamp) {
		this.reportTimestamp = reportTimestamp;
	}

	public Long getReportTimestamp() {
		return this.reportTimestamp;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setSubOrderList(String subOrderList) {
		this.subOrderList = subOrderList;
	}

	public void setSubOrderList(List<StoreAllocatedResult> subOrderList) {
		this.subOrderList = new JSONWriter(false,true).write(subOrderList);
	}

	public String getSubOrderList() {
		return this.subOrderList;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public String getApiMethodName() {
		return "taobao.omniorder.allocatedinfo.sync";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("report_timestamp", this.reportTimestamp);
		txtParams.put("status", this.status);
		txtParams.put("sub_order_list", this.subOrderList);
		txtParams.put("tid", this.tid);
		txtParams.put("trace_id", this.traceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OmniorderAllocatedinfoSyncResponse> getResponseClass() {
		return OmniorderAllocatedinfoSyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reportTimestamp, "reportTimestamp");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkObjectMaxListSize(subOrderList, 20, "subOrderList");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	
	/**
 * 门店的分单列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class StoreAllocatedResult extends TaobaoObject {

	private static final long serialVersionUID = 7753141743476661228L;

	/**
		 * 扩展字段
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 0表示无系统异常
		 */
		@ApiField("code")
		private String code;
		/**
		 * 异常描述
		 */
		@ApiField("message")
		private String message;
		/**
		 * 订单分单状态, 可选值: Waiting(仍在派单中) Allocated(派单成功) AllocateFail(派单失败)
		 */
		@ApiField("status")
		private String status;
		/**
		 * 店铺Id, 可能是门店或者电商仓
		 */
		@ApiField("store_id")
		private String storeId;
		/**
		 * 店铺名称
		 */
		@ApiField("store_name")
		private String storeName;
		/**
		 * 店铺类型, 门店(Store)或者电商仓(Warehouse)
		 */
		@ApiField("store_type")
		private String storeType;
		/**
		 * 子订单Id
		 */
		@ApiField("sub_oid")
		private Long subOid;
		/**
		 * 主订单Id
		 */
		@ApiField("tid")
		private Long tid;
	

	public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public void setAttributesString(String attributes) {
			this.attributes = attributes;
		}
		
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStoreId() {
			return this.storeId;
		}
		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return this.storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getStoreType() {
			return this.storeType;
		}
		public void setStoreType(String storeType) {
			this.storeType = storeType;
		}
		public Long getSubOid() {
			return this.subOid;
		}
		public void setSubOid(Long subOid) {
			this.subOid = subOid;
		}
		public Long getTid() {
			return this.tid;
		}
		public void setTid(Long tid) {
			this.tid = tid;
		}

}


}
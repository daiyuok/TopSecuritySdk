package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5573978333623835227L;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("modules")
	@ApiField("waybill_cloud_print_response")
	private List<WaybillCloudPrintResponse> modules;


	public void setModules(List<WaybillCloudPrintResponse> modules) {
		this.modules = modules;
	}
	public List<WaybillCloudPrintResponse> getModules( ) {
		return this.modules;
	}
	
	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillCloudPrintResponse extends TaobaoObject {

	private static final long serialVersionUID = 6356712586146666177L;

	/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 模板内容,具体解释见<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.8cf9Nj&treeId=17&articleId=105085&docType=1#12">链接</a>
		 */
		@ApiField("print_data")
		private String printData;
		/**
		 * 面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public String getPrintData() {
			return this.printData;
		}
		public void setPrintData(String printData) {
			this.printData = printData;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}

}



}

package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.providerlist.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceProviderlistGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1765537797354612383L;

	/** 
	 * 查询结果集
	 */
	@ApiField("result")
	private ResultSet result;


	public void setResult(ResultSet result) {
		this.result = result;
	}
	public ResultSet getResult( ) {
		return this.result;
	}
	
	/**
 * 开票商列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InvoiceProvider extends TaobaoObject {

	private static final long serialVersionUID = 2872578388463551932L;

	/**
		 * 开票商的appkey
		 */
		@ApiField("app_key")
		private String appKey;
		/**
		 * 开票商名称
		 */
		@ApiField("name")
		private String name;
	

	public String getAppKey() {
			return this.appKey;
		}
		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}

}

	/**
 * 查询结果集
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 3118998812833625449L;

	/**
		 * 开票商列表
		 */
		@ApiListField("provider_list")
		@ApiField("invoice_provider")
		private List<InvoiceProvider> providerList;
		/**
		 * 总记录条数
		 */
		@ApiField("total_count")
		private Long totalCount;
	

	public List<InvoiceProvider> getProviderList() {
			return this.providerList;
		}
		public void setProviderList(List<InvoiceProvider> providerList) {
			this.providerList = providerList;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

}



}

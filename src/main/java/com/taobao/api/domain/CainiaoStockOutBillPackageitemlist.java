package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 包裹内物品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillPackageitemlist extends TaobaoObject {

	private static final long serialVersionUID = 2645179253733112291L;

	/**
	 * 1
	 */
	@ApiField("package_item")
	private CainiaoStockOutBillPackageitem packageItem;


	public CainiaoStockOutBillPackageitem getPackageItem() {
		return this.packageItem;
	}
	public void setPackageItem(CainiaoStockOutBillPackageitem packageItem) {
		this.packageItem = packageItem;
	}

}

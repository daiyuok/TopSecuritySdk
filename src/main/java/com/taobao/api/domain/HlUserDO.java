package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单全链路用户信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class HlUserDO extends TaobaoObject {

	private static final long serialVersionUID = 5679273695767828839L;

	/**
	 * 回流信息是否开通买家端展示
	 */
	@ApiField("open_for_buyer")
	private String openForBuyer;

	/**
	 * 如果为空，则默认是X_TO_SYSTEM,X_WAIT_ALLOCATION,X_OUT_WAREHOUSE
	 */
	@ApiField("open_nodes")
	private String openNodes;


	public String getOpenForBuyer() {
		return this.openForBuyer;
	}
	public void setOpenForBuyer(String openForBuyer) {
		this.openForBuyer = openForBuyer;
	}

	public String getOpenNodes() {
		return this.openNodes;
	}
	public void setOpenNodes(String openNodes) {
		this.openNodes = openNodes;
	}

}

package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * API参数数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ApiParam extends TaobaoObject {

	private static final long serialVersionUID = 5137359365596347892L;

	/**
	 * API ID
	 */
	@ApiField("api_id")
	private Long apiId;

	/**
	 * 参数默认值
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 参数示例值
	 */
	@ApiField("demo_value")
	private String demoValue;

	/**
	 * 参数名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否必须
	 */
	@ApiField("require_type")
	private Long requireType;

	/**
	 * 数据结构ID
	 */
	@ApiField("struct_id")
	private Long structId;

	/**
	 * 参数类型
	 */
	@ApiField("type")
	private Long type;


	public Long getApiId() {
		return this.apiId;
	}
	public void setApiId(Long apiId) {
		this.apiId = apiId;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDemoValue() {
		return this.demoValue;
	}
	public void setDemoValue(String demoValue) {
		this.demoValue = demoValue;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRequireType() {
		return this.requireType;
	}
	public void setRequireType(Long requireType) {
		this.requireType = requireType;
	}

	public Long getStructId() {
		return this.structId;
	}
	public void setStructId(Long structId) {
		this.structId = structId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}

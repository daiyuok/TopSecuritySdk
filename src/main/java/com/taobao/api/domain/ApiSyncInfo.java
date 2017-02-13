package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * API信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ApiSyncInfo extends TaobaoObject {

	private static final long serialVersionUID = 2793434776478171581L;

	/**
	 * API入参列表
	 */
	@ApiListField("api_req_params")
	@ApiField("api_param")
	private List<ApiParam> apiReqParams;

	/**
	 * 后台类目名称
	 */
	@ApiField("bg_cat_name")
	private String bgCatName;

	/**
	 * 后台类目ID
	 */
	@ApiField("bg_category_id")
	private Long bgCategoryId;

	/**
	 * 前台类目ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 定义文件内容
	 */
	@ApiField("define_file_content")
	private String defineFileContent;

	/**
	 * api描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否是新流程api
	 */
	@ApiField("is_new_process")
	private Boolean isNewProcess;

	/**
	 * api对应的标签
	 */
	@ApiListField("label_list")
	@ApiField("string")
	private List<String> labelList;

	/**
	 * mapping映射文件
	 */
	@ApiField("mapping_file_content")
	private String mappingFileContent;

	/**
	 * API名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务方法名称
	 */
	@ApiField("service_method")
	private String serviceMethod;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务方法名称
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 是否需要登录。NO_NEED(不需用户授权),REQUIRED(必须用户授权),OPTIONAL(可选用户授权),BI_SESSIONS(双方用户授权)
	 */
	@ApiField("session_binding_type")
	private String sessionBindingType;


	public List<ApiParam> getApiReqParams() {
		return this.apiReqParams;
	}
	public void setApiReqParams(List<ApiParam> apiReqParams) {
		this.apiReqParams = apiReqParams;
	}

	public String getBgCatName() {
		return this.bgCatName;
	}
	public void setBgCatName(String bgCatName) {
		this.bgCatName = bgCatName;
	}

	public Long getBgCategoryId() {
		return this.bgCategoryId;
	}
	public void setBgCategoryId(Long bgCategoryId) {
		this.bgCategoryId = bgCategoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getDefineFileContent() {
		return this.defineFileContent;
	}
	public void setDefineFileContent(String defineFileContent) {
		this.defineFileContent = defineFileContent;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsNewProcess() {
		return this.isNewProcess;
	}
	public void setIsNewProcess(Boolean isNewProcess) {
		this.isNewProcess = isNewProcess;
	}

	public List<String> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<String> labelList) {
		this.labelList = labelList;
	}

	public String getMappingFileContent() {
		return this.mappingFileContent;
	}
	public void setMappingFileContent(String mappingFileContent) {
		this.mappingFileContent = mappingFileContent;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServiceMethod() {
		return this.serviceMethod;
	}
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getSessionBindingType() {
		return this.sessionBindingType;
	}
	public void setSessionBindingType(String sessionBindingType) {
		this.sessionBindingType = sessionBindingType;
	}

}

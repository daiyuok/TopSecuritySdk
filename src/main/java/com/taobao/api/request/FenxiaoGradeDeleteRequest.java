package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoGradeDeleteResponse;

/**
 * TOP API: taobao.fenxiao.grade.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class FenxiaoGradeDeleteRequest extends BaseTaobaoRequest<FenxiaoGradeDeleteResponse> {
	
	

	/** 
	* 等级ID
	 */
	private Long gradeId;

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getGradeId() {
		return this.gradeId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.grade.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("grade_id", this.gradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoGradeDeleteResponse> getResponseClass() {
		return FenxiaoGradeDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(gradeId, "gradeId");
	}
	

}
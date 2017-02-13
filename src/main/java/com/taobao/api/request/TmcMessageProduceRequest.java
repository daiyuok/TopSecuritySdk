package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcMessageProduceResponse;

/**
 * TOP API: taobao.tmc.message.produce request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.02
 */
public class TmcMessageProduceRequest extends BaseTaobaoRequest<TmcMessageProduceResponse> implements TaobaoUploadRequest<TmcMessageProduceResponse> {

	
	

	/** 
	* 消息内容的JSON表述，必须按照topic的定义来填充
	 */
	private String content;

	/** 
	* 消息的扩增属性，用json格式表示
	 */
	private String exContent;

	/** 
	* 回传的文件内容，目前仅支持jpg,png,bmp,gif,pdf类型的文件，文件最大1M。只有消息中有byte[]类型的数据时，才需要传此字段; 否则不需要传此字段。
	 */
	private FileItem mediaContent;

	/** 
	* 回传的文件内容，目前仅支持jpg,png,bmp,gif,pdf类型的文件，文件最大1M。只有消息中有byte[]类型的数据时，才需要传此字段; 否则不需要传此字段。具体对应到沙体中的什么值，请参考消息字段说明。
	 */
	private FileItem mediaContent2;

	/** 
	* 回传的文件内容，目前仅支持jpg,png,bmp,gif,pdf类型的文件，文件最大1M。只有消息中有byte[]类型的数据时，才需要传此字段; 否则不需要传此字段。具体对应到沙体中的什么值，请参考消息字段说明。
	 */
	private FileItem mediaContent3;

	/** 
	* 回传的文件内容，目前仅支持jpg,png,bmp,gif,pdf类型的文件，文件最大1M。只有消息中有byte[]类型的数据时，才需要传此字段; 否则不需要传此字段。具体对应到沙体中的什么值，请参考消息字段说明。
	 */
	private FileItem mediaContent4;

	/** 
	* 回传的文件内容，目前仅支持jpg,png,bmp,gif,pdf类型的文件，文件最大1M。只有消息中有byte[]类型的数据时，才需要传此字段; 否则不需要传此字段。具体对应到沙体中的什么值，请参考消息字段说明。
	 */
	private FileItem mediaContent5;

	/** 
	* 直发消息需要传入目标appkey
	 */
	private String targetAppkey;

	/** 
	* 目标分组，一般为default
	 */
	private String targetGroup;

	/** 
	* 消息类型
	 */
	private String topic;

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setExContent(String exContent) {
		this.exContent = exContent;
	}

	public String getExContent() {
		return this.exContent;
	}

	public void setMediaContent(FileItem mediaContent) {
		this.mediaContent = mediaContent;
	}

	public FileItem getMediaContent() {
		return this.mediaContent;
	}

	public void setMediaContent2(FileItem mediaContent2) {
		this.mediaContent2 = mediaContent2;
	}

	public FileItem getMediaContent2() {
		return this.mediaContent2;
	}

	public void setMediaContent3(FileItem mediaContent3) {
		this.mediaContent3 = mediaContent3;
	}

	public FileItem getMediaContent3() {
		return this.mediaContent3;
	}

	public void setMediaContent4(FileItem mediaContent4) {
		this.mediaContent4 = mediaContent4;
	}

	public FileItem getMediaContent4() {
		return this.mediaContent4;
	}

	public void setMediaContent5(FileItem mediaContent5) {
		this.mediaContent5 = mediaContent5;
	}

	public FileItem getMediaContent5() {
		return this.mediaContent5;
	}

	public void setTargetAppkey(String targetAppkey) {
		this.targetAppkey = targetAppkey;
	}

	public String getTargetAppkey() {
		return this.targetAppkey;
	}

	public void setTargetGroup(String targetGroup) {
		this.targetGroup = targetGroup;
	}

	public String getTargetGroup() {
		return this.targetGroup;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return this.topic;
	}

	public String getApiMethodName() {
		return "taobao.tmc.message.produce";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("ex_content", this.exContent);
		txtParams.put("target_appkey", this.targetAppkey);
		txtParams.put("target_group", this.targetGroup);
		txtParams.put("topic", this.topic);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcMessageProduceResponse> getResponseClass() {
		return TmcMessageProduceResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkMaxLength(content, 5000, "content");
		RequestCheckUtils.checkMaxLength(exContent, 500, "exContent");
		RequestCheckUtils.checkMaxLength(targetAppkey, 256, "targetAppkey");
		RequestCheckUtils.checkNotEmpty(topic, "topic");
		RequestCheckUtils.checkMaxLength(topic, 256, "topic");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("media_content", this.mediaContent);
		params.put("media_content2", this.mediaContent2);
		params.put("media_content3", this.mediaContent3);
		params.put("media_content4", this.mediaContent4);
		params.put("media_content5", this.mediaContent5);
		return params;
	}
	
	

}
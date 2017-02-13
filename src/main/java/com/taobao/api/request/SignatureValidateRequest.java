package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SignatureValidateResponse;

/**
 * TOP API: taobao.signature.validate request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.10
 */
public class SignatureValidateRequest extends BaseTaobaoRequest<SignatureValidateResponse> implements TaobaoUploadRequest<SignatureValidateResponse> {

	
	

	/** 
	* 签名算法，可选值：HmacMD5, HmacSHA1
	 */
	private String algorithm;

	/** 
	* 待签名的请求体，最大5M
	 */
	private FileItem body;

	/** 
	* 字节流编码方式，可选值：utf-8, gbk
	 */
	private String charset;

	/** 
	* ISV的AppKey
	 */
	private String proxyAppKey;

	/** 
	* 待验证的签名
	 */
	private String signature;

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setBody(FileItem body) {
		this.body = body;
	}

	public FileItem getBody() {
		return this.body;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getCharset() {
		return this.charset;
	}

	public void setProxyAppKey(String proxyAppKey) {
		this.proxyAppKey = proxyAppKey;
	}

	public String getProxyAppKey() {
		return this.proxyAppKey;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignature() {
		return this.signature;
	}

	public String getApiMethodName() {
		return "taobao.signature.validate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("algorithm", this.algorithm);
		txtParams.put("charset", this.charset);
		txtParams.put("proxy_app_key", this.proxyAppKey);
		txtParams.put("signature", this.signature);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SignatureValidateResponse> getResponseClass() {
		return SignatureValidateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(body, "body");
		RequestCheckUtils.checkNotEmpty(proxyAppKey, "proxyAppKey");
		RequestCheckUtils.checkNotEmpty(signature, "signature");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("body", this.body);
		return params;
	}
	
	

}
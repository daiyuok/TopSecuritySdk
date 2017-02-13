package com.taobao.api.internal.report;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.security.SecurityCore;
import com.taobao.api.security.SecurityCounter;

/**
 * API报表
 * 
 * @author changchun
 */
public class ApiReporter {

    private static final Log log = LogFactory.getLog(ApiReporter.class);
    private static final AtomicBoolean initSecretAtomic = new AtomicBoolean(false);
    private static final long FLUSH_INTERVAL = 1000L * 60 * 5;// 5分钟
    private static final long MIN_FLUSH_INTERVAL = 1000L * 60 * 1;// 1分钟
    private static final String SECRET_TYPE = "1";
    private TaobaoClient taobaoClient;

    public void initSecret(TaobaoClient taobaoClient) {
        this.taobaoClient = taobaoClient;
        if (!initSecretAtomic.get()) {
            initSecretThread();
        }
    }

    /**
     * 初始化一次
     */
    @Deprecated
    private void initSecretThread() {
        if (initSecretAtomic.compareAndSet(false, true)) {
            new Thread("flushSecretApiReporter-thread") {
                public void run() {
                    long uploadInterval = FLUSH_INTERVAL;
                    while (true) {
                        try {
                            Thread.sleep(uploadInterval);
                            Map<String, Object> jsonMap = new HashMap<String, Object>();
                            jsonMap.put("sessionNum", SecurityCore.getAppUserSecretCache().size());
                            
                            jsonMap.put("encryptPhoneNum", SecurityCounter.getEncryptPhoneNum());
                            jsonMap.put("encryptNickNum", SecurityCounter.getEncryptNickNum());
                            jsonMap.put("encryptReceiverNameNum", SecurityCounter.getEncryptReceiverNameNum());
                            jsonMap.put("encryptSimpleNum", SecurityCounter.getEncryptSimpleNum());
                            jsonMap.put("encryptSearchNum", SecurityCounter.getEncryptSearchNum());

                            jsonMap.put("decryptPhoneNum", SecurityCounter.getDecryptPhoneNum());
                            jsonMap.put("decryptNickNum", SecurityCounter.getDecryptNickNum());
                            jsonMap.put("decryptReceiverNameNum", SecurityCounter.getDecryptReceiverNameNum());
                            jsonMap.put("decryptSimpleNum", SecurityCounter.getDecryptSimpleNum());
                            jsonMap.put("decryptSearchNum", SecurityCounter.getDecryptSearchNum());

                            jsonMap.put("searchPhoneNum", SecurityCounter.getSearchPhoneNum());
                            jsonMap.put("searchNickNum", SecurityCounter.getSearchNickNum());
                            jsonMap.put("searchReceiverNameNum", SecurityCounter.getSearchReceiverNameNum());
                            jsonMap.put("searchSimpleNum", SecurityCounter.getSearchSimpleNum());
                            jsonMap.put("searchSearchNum", SecurityCounter.getSearchSearchNum());
                            
                            String contentJson = TaobaoUtils.objectToJson(jsonMap);
                            SecurityCounter.reset();
                            uploadInterval = doUpload(contentJson, SECRET_TYPE);

                        } catch (Throwable e) {
                            log.error("flushSecretApiReporter error", e);
                        }
                    }
                }

            }.start();
        }
    }

    private long doUpload(String contentJson, String type) throws ApiException {
        long uploadInterval = FLUSH_INTERVAL;
        TopSdkFeedbackUploadRequest request = new TopSdkFeedbackUploadRequest();
        request.setType(type);
        request.setContent(contentJson);

        TopSdkFeedbackUploadResponse response = taobaoClient.execute(request, null);
        if (response.isSuccess()) {
            uploadInterval = response.getUploadInterval();
            if (uploadInterval < MIN_FLUSH_INTERVAL) {
                uploadInterval = FLUSH_INTERVAL;
            }
        }
        return uploadInterval;
    }
}

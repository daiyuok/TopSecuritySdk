package util;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.security.SecurityClient;

/**
 * Created by uu on 17-2-13.
 */
public class MatrixSecurityClient {

    private static MatrixSecurityClient configuration = new MatrixSecurityClient();

    private SecurityClient securityClient = null;

    public static MatrixSecurityClient getInstance() {
        return configuration;
    }

    public SecurityClient getSecurityClient() {
        return securityClient;
    }

    private MatrixSecurityClient() {
        loadMatrixClient();
    }

    private void loadMatrixClient() {
        System.out.println("=============1");
        PropertiesUtil parser = PropertiesUtil.getInstance();
        System.out.println("=============2");

        String serverUrl = parser.getValue("serverUrl");

        String appkey = parser.getValue("appkey");

        String appSecret = parser.getValue("appSecret");

        String randomNum = parser.getValue("randomNum");

        securityClient = new SecurityClient(new DefaultTaobaoClient(serverUrl, appkey, appSecret), randomNum);
    }
}

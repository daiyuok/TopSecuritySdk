package util;

import com.taobao.api.SecretException;
import com.taobao.api.security.SecurityBiz;
import com.taobao.api.security.SecurityClient;

/**
 * Created by uu on 17-2-13.
 */
public class SecurityUtil {

    private static SecurityClient securityClient = MatrixSecurityClient.getInstance().getSecurityClient();

    /**
     * 加密手机号
     *
     * @param phone
     * @param sessionKey
     * @return
     */
    public String encryptPhone(String phone, String sessionKey) {
        String encrtyPhone = "";

        try {
            encrtyPhone = securityClient.encrypt(phone, Constant.PHONE, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return encrtyPhone;
    }

    /**
     * 解密手机号
     *
     * @param encrtyPhone
     * @param sessionKey
     * @return
     */
    public String decryptPhone(String encrtyPhone, String sessionKey) {
        String phone = "";

        try {
            phone = securityClient.decrypt(encrtyPhone, Constant.PHONE, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return phone;
    }


    /**
     * 加密昵称
     *
     * @param nick
     * @param sessionKey
     * @return
     */
    public String encryptNick(String nick, String sessionKey) {
        String encrtyNick = "";

        try {
            encrtyNick = securityClient.encrypt(nick, Constant.NICK, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return encrtyNick;
    }

    /**
     * 解密昵称
     *
     * @param encrtyNick
     * @param sessionKey
     * @return
     */
    public String decryptNick(String encrtyNick, String sessionKey) {
        String nick = "";

        try {
            nick = securityClient.decrypt(encrtyNick, Constant.NICK, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return nick;
    }


    /**
     * 加密收件人姓名
     *
     * @param receiverName
     * @param sessionKey
     * @return
     */
    public String encryptReceiverName(String receiverName, String sessionKey) {
        String encryptReceiverName = "";

        try {
            encryptReceiverName = securityClient.encrypt(receiverName, Constant.RECEIVER_NAME, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return encryptReceiverName;
    }

    /**
     * 解密收件人姓名
     *
     * @param encryptReceiverName
     * @param sessionKey
     * @return
     */
    public String decryptReceiverName(String encryptReceiverName, String sessionKey) {
        String receiverName = "";

        try {
            receiverName = securityClient.decrypt(encryptReceiverName, Constant.RECEIVER_NAME, sessionKey);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return receiverName;
    }


    public boolean isEncryptData(String data, String type) {
        boolean isEncrypt = false;
        try {
            isEncrypt = SecurityBiz.isEncryptData(data, type);
        } catch (SecretException e) {
            e.printStackTrace();
        }
        return isEncrypt;
    }

}


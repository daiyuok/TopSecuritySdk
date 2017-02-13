/**
 * Created by uu on 17-2-8.
 */

import com.taobao.api.security.SecurityClient;
import util.Constant;
import util.MatrixSecurityClient;

public class TopSanboxTest {

    public String say(String name) {
        return "my name is " + name;
    }

    public static void main(String args[]) throws Exception {
        SecurityClient securityClient = MatrixSecurityClient.getInstance().getSecurityClient();

        String sessionKey = "6102919732872eb32bfc669a614176c83afa798380475a3182558410";

        String encrty_num = securityClient.encrypt("18721883292", Constant.PHONE, sessionKey);

        System.out.println("手机号码密文:" + encrty_num);

        String receiver_mobile = "$PH90OGXVHXFV6wKvGhOjUQ==$fFp67AbNmUOLpl/8VjrLng==$1$$";

        if (SecurityClient.isEncryptData(receiver_mobile, Constant.PHONE)) {
            String originVal = securityClient.decrypt(receiver_mobile, Constant.PHONE, sessionKey);
            System.out.println("手机号码明文:" + originVal);
        }

        String buyer_nick = "~YBqX+DparMQTbcvGJqrXrg==~ljJyHfKsQFTNtkkcXBJ7x7V33kD1EAw3~1~~";

        if (SecurityClient.isEncryptData(buyer_nick, Constant.NICK)) {
            String originVal = securityClient.decrypt(buyer_nick, Constant.NICK, sessionKey);
            System.out.println("昵称明文:" + originVal);
        }

        String receiver_name = "~/UF+kFhsFGztCHGE5yBgEQ==~9+7o~1~~";

        if (SecurityClient.isEncryptData(receiver_name, Constant.RECEIVER_NAME)) {
            String originVal = securityClient.decrypt(receiver_name, Constant.RECEIVER_NAME, sessionKey);
            System.out.println("收件人姓名:" + originVal);
        }
    }
}

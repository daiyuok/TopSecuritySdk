import util.Constant;
import util.SecurityUtil;

/**
 * Created by uu on 17-2-13.
 */

public class TestMatrixSecurityClient {

    public static void main(String args[]) {

        SecurityUtil securityUtil = new SecurityUtil();

        String sessionKey = "";
//
//        System.out.println(securityUtil.encryptPhone("18721883292", sessionKey));

        String receiver_mobile = "$8SPcn5YcviStk1oP01BhNg==$1ejKajhsndi0370DKbiU/w==$1$$";

        System.out.println(securityUtil.decryptPhone(receiver_mobile, sessionKey));

//        System.out.println(securityUtil.isEncryptData(receiver_mobile, Constant.PHONE));
//
//        String buyer_email = "~p5PQ2sX2DTcDmS5SZtvqkth2CXggVAVlPgJNF7qmbMk=~ljJyHfKsQFTNtkkcXBJ7x7V33kD1EAw3lSAoqRQdTvxYkSiRqc7ax+4TljJyHfKsQFTNtkkcJOcXlusBgqXVK0TW~1~~";
//
//        System.out.println(securityUtil.isEncryptData(buyer_email, Constant.SIMPLE));
//
//        System.out.println(securityUtil.decryptSimple(buyer_email, sessionKey));
//
//        String receiver_phone = "~8N5VevW6SSX0EI+GWzTYXg==~1~";
//
//        System.out.println(securityUtil.decryptSimple(receiver_phone, sessionKey));

        String receiver_name = "~8BAXbKiBsoj+qjcopgIaRQ==~hRWfe1d3~1~~";

        System.out.println(securityUtil.decryptReceiverName(receiver_name, sessionKey));

        String buyer_nick = "~k4g46TQTVWLvUrKWDSPXDQ==~dm8cMDeuTMvtJ6n7~1~~";

        System.out.println(securityUtil.decryptNick(buyer_nick, sessionKey));
    }
}

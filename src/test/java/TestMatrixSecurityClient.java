import util.Constant;
import util.SecurityUtil;

/**
 * Created by uu on 17-2-13.
 */

public class TestMatrixSecurityClient {

    public static void main(String args[]) {

        SecurityUtil securityUtil = new SecurityUtil();

        String sessionKey = "62019017ace9b6ZZ40ef5791ed7a7f5f8788056bace466e1050861231";
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

    }

}

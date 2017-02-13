import util.Constant;
import util.SecurityUtil;

/**
 * Created by uu on 17-2-13.
 */
public class TestMatrixSecurityClient {

    public static void main(String args[]) {

        SecurityUtil securityUtil = new SecurityUtil();

        String sessionKey = "6102919732872eb32bfc669a614176c83afa798380475a3182558410";

        System.out.println(securityUtil.encryptPhone("18721883292", sessionKey));

        String receiver_mobile = "$PH90OGXVHXFV6wKvGhOjUQ==$fFp67AbNmUOLpl/8VjrLng==$1$$";

        System.out.println(securityUtil.decryptPhone(receiver_mobile, sessionKey));

        System.out.println(securityUtil.isEncryptData(receiver_mobile, Constant.PHONE));

    }

}

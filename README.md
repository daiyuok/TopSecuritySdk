# TopSecuritySdk 
---
**用途**

实现Java 或者python 调用 taobao Top 加密数据解密 的SDK 封装

---

---
**1.	修改配置文件**

    配置文件

serverUrl=https://gw.api.tbsandbox.com/router/rest

appkey=                   
    
appSecret=

randomNum=

---

---
**2.	构建安装**

 1. 使用maven构建
 mvn clean package

目标生成文件在target/top-security-sdk-1.0.jar

---

---
**3.	用法**

 SecurityUtil securityUtil = new SecurityUtil();
 
 util.isEncryptData(receiver_mobile, Constant.PHONE)#判断电话是否已加密
 
 util.encryptPhone("18721883292", sessionKey) #加密电话号码
 
 String receiver_mobile = "$8SPcn5YcviStk1oP01BhNg==$1ejKajhsndi0370DKbiU/w==$1$$";
 
 util.decryptPhone(receiver_mobile, sessionKey)#解密电话号码
 
public static final String PHONE = "phone";

public static final String NICK = "nick";

public static final String RECEIVER_NAME = "receiver_name";

public static final String NORMAL = "normal";

public static final String SIMPLE = "simple";

**详细使用请查看[TestMatrixSecurityClient.java](https://github.com/daiyuok/TopSecuritySdk/blob/master/src/test/java/TestMatrixSecurityClient.java)**

---





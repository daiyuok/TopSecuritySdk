package com.taobao.api.security;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 计数器
 * 
 * @author changchun
 * @since 2016年8月16日 下午7:45:54
 */
public class SecurityCounter implements SecurityConstants {
    private static AtomicLong encryptPhoneNum = new AtomicLong(0);
    private static AtomicLong encryptNickNum = new AtomicLong(0);
    private static AtomicLong encryptReceiverNameNum = new AtomicLong(0);
    private static AtomicLong encryptSimpleNum = new AtomicLong(0);
    private static AtomicLong encryptSearchNum = new AtomicLong(0);

    private static AtomicLong decryptPhoneNum = new AtomicLong(0);
    private static AtomicLong decryptNickNum = new AtomicLong(0);
    private static AtomicLong decryptReceiverNameNum = new AtomicLong(0);
    private static AtomicLong decryptSimpleNum = new AtomicLong(0);
    private static AtomicLong decryptSearchNum = new AtomicLong(0);

    private static AtomicLong searchPhoneNum = new AtomicLong(0);
    private static AtomicLong searchNickNum = new AtomicLong(0);
    private static AtomicLong searchReceiverNameNum = new AtomicLong(0);
    private static AtomicLong searchSimpleNum = new AtomicLong(0);
    private static AtomicLong searchSearchNum = new AtomicLong(0);

    public static AtomicLong getEncryptPhoneNum() {
        return encryptPhoneNum;
    }

    public static AtomicLong getEncryptNickNum() {
        return encryptNickNum;
    }

    public static AtomicLong getEncryptReceiverNameNum() {
        return encryptReceiverNameNum;
    }

    public static AtomicLong getDecryptPhoneNum() {
        return decryptPhoneNum;
    }

    public static AtomicLong getDecryptNickNum() {
        return decryptNickNum;
    }

    public static AtomicLong getDecryptReceiverNameNum() {
        return decryptReceiverNameNum;
    }

    public static AtomicLong getSearchPhoneNum() {
        return searchPhoneNum;
    }

    public static AtomicLong getSearchNickNum() {
        return searchNickNum;
    }

    public static AtomicLong getSearchReceiverNameNum() {
        return searchReceiverNameNum;
    }

    public static AtomicLong getEncryptSimpleNum() {
        return encryptSimpleNum;
    }

    public static AtomicLong getEncryptSearchNum() {
        return encryptSearchNum;
    }

    public static AtomicLong getDecryptSimpleNum() {
        return decryptSimpleNum;
    }

    public static AtomicLong getDecryptSearchNum() {
        return decryptSearchNum;
    }

    public static AtomicLong getSearchSimpleNum() {
        return searchSimpleNum;
    }

    public static AtomicLong getSearchSearchNum() {
        return searchSearchNum;
    }

    public static void reset() {
        encryptPhoneNum.getAndSet(0);
        encryptNickNum.getAndSet(0);
        encryptReceiverNameNum.getAndSet(0);
        encryptSimpleNum.getAndSet(0);
        encryptSearchNum.getAndSet(0);

        decryptPhoneNum.getAndSet(0);
        decryptNickNum.getAndSet(0);
        decryptReceiverNameNum.getAndSet(0);
        decryptSimpleNum.getAndSet(0);
        decryptSearchNum.getAndSet(0);

        searchPhoneNum.getAndSet(0);
        searchNickNum.getAndSet(0);
        searchReceiverNameNum.getAndSet(0);
        searchSimpleNum.getAndSet(0);
        searchSearchNum.getAndSet(0);
    }

    public static void addEncryptCount(String type) {
        if (PHONE.equals(type)) {
            encryptPhoneNum.incrementAndGet();
        } else if (NICK.equals(type)) {
            encryptNickNum.incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            encryptReceiverNameNum.incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            encryptSimpleNum.incrementAndGet();
        } else if (SEARCH.equals(type)) {
            encryptSearchNum.incrementAndGet();
        }
    }

    public static void addDecryptCount(String type) {
        if (PHONE.equals(type)) {
            decryptPhoneNum.incrementAndGet();
        } else if (NICK.equals(type)) {
            decryptNickNum.incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            decryptReceiverNameNum.incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            decryptSimpleNum.incrementAndGet();
        } else if (SEARCH.equals(type)) {
            decryptSearchNum.incrementAndGet();
        }
    }

    public static void addSearchCount(String type) {
        if (PHONE.equals(type)) {
            searchPhoneNum.incrementAndGet();
        } else if (NICK.equals(type)) {
            searchNickNum.incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            searchReceiverNameNum.incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            searchSimpleNum.incrementAndGet();
        } else if (SEARCH.equals(type)) {
            searchSearchNum.incrementAndGet();
        }
    }
}

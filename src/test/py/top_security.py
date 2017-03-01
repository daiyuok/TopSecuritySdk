# coding=utf-8
# py 请求 top sdk jar 的桥接
__author__ = 'uu'
import os
import jpype


def get_security_util():
    jarpath = os.path.join(os.path.dirname(os.path.realpath(__file__)), 'top-security-sdk-1.0.jar')
    if not jpype.isJVMStarted():
        jpype.startJVM(jpype.getDefaultJVMPath(), "-ea", "-Djava.class.path=%s" % jarpath)
    SecurityUtil = jpype.JClass('util.SecurityUtil')
    s = SecurityUtil()
    return s


def decrypt_nick(s, nick, sessionKey):
    try:
        if s.isEncryptData(nick, "nick"):
            return s.decryptNick(nick, sessionKey)
        else:
            return nick
    except Exception:
        return nick


def decrypt_phone(s, phone, sessionKey):
    try:
        if s.isEncryptData(phone, "phone"):
            return s.decryptPhone(phone, sessionKey)
        elif s.isEncryptData(phone, "simple"):
            return s.decryptSimple(phone, sessionKey)
        else:
            return phone
    except Exception:
        return phone


def decrypt_receiver_name(s, receiver_name, sessionKey):
    try:
        if s.isEncryptData(receiver_name, "receiver_name"):
            return s.decryptReceiverName(receiver_name, sessionKey)
        else:
            return receiver_name
    except Exception:
        return receiver_name


def decrypt_simple(s, decrype_val, sessionKey):
    try:
        if s.isEncryptData(decrype_val, "simple"):
            return s.decryptSimple(decrype_val, sessionKey)
        else:
            return decrype_val
    except Exception:
        return decrype_val


if __name__ == "__main__":
    sessionKey = "62019017ace9b6ZZ40ef5791ed7a7f5f8788056bace466e1050861231"
    security_util = get_security_util()

    print decrypt_phone(security_util, "$8SPcn5YcviStk1oP01BhNg==$1ejKajhsndi0370DKbiU/w==$1$$", sessionKey)

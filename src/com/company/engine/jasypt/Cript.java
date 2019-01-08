package com.company.engine.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Cript {
    private  static  String Password = "RicardoMillos";
    String encryptedPassword;
    //шифровка строки вход идут строка
    public String StartCript(String Text) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(Password);
        encryptedPassword = encryptor.encrypt(Text);
        return encryptedPassword;
    }
    //разшифровка строки вход идут строка
    public String startDisCript(String Text){
        StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
        decryptor.setPassword(Password);
        return decryptor.decrypt(Text);
    }
}

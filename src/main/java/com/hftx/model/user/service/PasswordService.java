package com.hftx.model.user.service;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordService {
    private static final int ROUND = 12;

    /*
    * Gera o Hash
    */
    public static String pswHash(String psw){
        return BCrypt.hashpw(psw, BCrypt.gensalt(ROUND));
    }

    /*
    * Validação do hash
    */
    public static Boolean pswValidation(String no_hashed_psw, String hashed_psw){
        return BCrypt.checkpw(no_hashed_psw, hashed_psw);
    }
}

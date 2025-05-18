package io.github.VitorLopes.trabalho_seguranca_em_nuvem.security;

import java.security.MessageDigest;
import java.util.Base64;

public class HashUtil {

    public static String sha256(String data) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(hash);
    }
}
package io.github.VitorLopes.trabalho_seguranca_em_nuvem.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;

public class AESUtil {

    private static final String SECRET = "minha-chave-secreta"; // Pode vir de config

    private static SecretKeySpec getKey() throws Exception {
        byte[] key = SECRET.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        return new SecretKeySpec(sha.digest(key), "AES");
    }

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, getKey());
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
    }

    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, getKey());
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }
}
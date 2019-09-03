package com.harwoodjp.Crypto;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {
	private static Cipher cipher;
	
	public static String encrypt(String strToEncrypt, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchPaddingException, 
			InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
	}
	
	public static String decrypt(String strToDecrypt, PublicKey publicKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, 
			IllegalBlockSizeException, BadPaddingException {
		cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	}

	public static String encrypt(String strToEncrypt, PublicKey publicKey) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
	}

	public static String decrypt(String strToDecrypt, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	}

}

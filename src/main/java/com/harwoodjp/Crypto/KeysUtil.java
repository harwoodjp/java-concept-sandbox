package com.harwoodjp.Crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class KeysUtil {
//	private KeyPair keyPair;
//	private PrivateKey privateKey;
//	private PublicKey publicKey;
	
	public static KeyPair getKeyPair(int size) throws NoSuchAlgorithmException, NoSuchProviderException {
		KeyPairGenerator keyPairGenerator  = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(size);
		return keyPairGenerator.generateKeyPair();
	}
	
	
}

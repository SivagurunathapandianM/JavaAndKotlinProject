package com.java.security.assymmetric;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* 
 * Below Website has all the java hands on Cryptographic security technics
 * https://github.com/PacktPublishing/Hands-On-Cryptography-with-Java/tree/master/src/main/java/com/packtpub/crypto
 * https://github.com/PacktPublishing/Hands-On-Cryptography-with-Java/tree/master/src/main
 */

public class KeyPairGeneratorDemo {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		final KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		kpg.initialize(2048);
		final KeyPair kp = kpg.generateKeyPair();
		final PublicKey publicKey = kp.getPublic();
		final PrivateKey privateKey = kp.getPrivate();
		
		System.out.println("Public Key is "+publicKey);
		System.out.println("Hex Public Key is "+bytesToHex(publicKey.getEncoded()));
		
		System.out.println("Private Key is "+privateKey);
		System.out.println("Hex Private Key is "+bytesToHex(privateKey.getEncoded()));
	}
	

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}

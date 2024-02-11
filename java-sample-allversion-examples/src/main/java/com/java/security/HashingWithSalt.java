package com.java.security;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class HashingWithSalt {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		final String password = "12345";
		final String salt = "user@example.com";
		final int iterations = 32;

		PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterations, 512);

		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

		byte[] hashed = skf.generateSecret(keySpec).getEncoded();
		System.out.println("PBKDF2WithHmacSHA256::: "+bytesToHex(hashed));
		final String encoded = Base64.getEncoder().encodeToString(hashed);
		System.out.println("Encoded: " + encoded);
	}
	
	 private static String bytesToHex(byte[] bytes) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(String.format("%02X ", b));
	        }
	        return sb.toString();
	    }

}

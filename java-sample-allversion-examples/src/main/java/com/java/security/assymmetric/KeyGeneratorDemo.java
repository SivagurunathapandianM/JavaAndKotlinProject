package com.java.security.assymmetric;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGeneratorDemo {
	 public static void main(String[] args) throws NoSuchAlgorithmException {
	        final KeyGenerator kg = KeyGenerator.getInstance("AES");
	        kg.init(256);
	        final SecretKey secret = kg.generateKey();

	        System.out.println("Hex-encoded Secret key is: " + bytesToHex(secret.getEncoded()));
	    }

	  private static String bytesToHex(byte[] bytes) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(String.format("%02X ", b));
	        }
	        return sb.toString();
	    }
}

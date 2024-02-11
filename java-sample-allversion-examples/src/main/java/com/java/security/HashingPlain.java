package com.java.security;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingPlain {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		try(InputStream in= HashingPlain.class.getResourceAsStream("/myFile.txt")){
			 final byte[] bytes = new byte[1024];
			 int len;
			 for( len=in.read(bytes); len != -1;  len=in.read(bytes)) {
				md.update(bytes, 0, len);
			 }
		}
		
		//md.update(fileinbytes);
		//final byte[] hashed = md.doFinal();
		final byte[] hashed =md.digest();
		System.out.println("The SHA-256 value is::: "+bytesToHex(hashed));
	}
	

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}

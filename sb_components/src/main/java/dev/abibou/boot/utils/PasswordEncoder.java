package dev.abibou.boot.utils;

import java.util.Base64;

class PasswordEncoder {
	
	public PasswordEncoder() {
		System.out.println("PasswordEncoder :: constructor");
	}

	public String encodePassword(String pwd) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedPwd = encoder.encodeToString(pwd.getBytes());
		return encodedPwd;
	}

}

package com.ferbo.sgp.tools.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityTool {
	
	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public static boolean verifyPassword(String rawPassword, String hashedPasswordFromDb) {
        return encoder.matches(rawPassword, hashedPasswordFromDb);
    }

}

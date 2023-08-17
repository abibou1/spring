package dev.abibou.security.models;

import lombok.Data;

@Data
public class LoginRequest {
	private String username;
	private String password;

}

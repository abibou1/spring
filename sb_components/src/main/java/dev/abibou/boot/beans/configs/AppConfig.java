package dev.abibou.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.abibou.boot.utils.PasswordEncoder;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: constructor");
	}
	
	@Bean
	public PasswordEncoder getEncoder() {
		return new PasswordEncoder();
	}

}

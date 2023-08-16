package dev.abibou.security.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurityConfiguration {
	@Autowired
	BCryptPasswordEncoder pwdEncoder;
	
	@Bean
	public SecurityFilterChain fillerChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(request -> request.requestMatchers("/home", "/care").permitAll()
				.requestMatchers("/admin").hasRole("ADMIN")
				.requestMatchers("/manager").hasAnyRole("ADMIN", "MANAGER")
				.anyRequest().authenticated());
		httpSecurity.csrf(csrf -> csrf.disable());
		httpSecurity.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();	
	}
	
	@Bean
	public UserDetailsService userDetails() {
		var admin = User.withUsername("admin")
				.password(pwdEncoder.encode("12345"))
				.roles("ADMIN")
				.build();
		
		var manager = User.withUsername("manager")
				.password(pwdEncoder.encode("12345"))
				.roles("MANAGER")
				.build();
		
		var user = User.withUsername("ambodji")
				.password(pwdEncoder.encode("12345"))
				.roles("USER")
				.build();
		
		UserDetailsService users = new InMemoryUserDetailsManager(admin, manager, user);
		
		return users;
		
	}

}

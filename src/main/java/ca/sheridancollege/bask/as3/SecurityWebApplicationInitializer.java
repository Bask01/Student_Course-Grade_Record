package ca.sheridancollege.bask.as3;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import ca.sheridancollege.bask.as3.security.SecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
		
	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
		
}
}

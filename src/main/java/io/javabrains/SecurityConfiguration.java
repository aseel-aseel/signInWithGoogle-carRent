package io.javabrains;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableAutoConfiguration
@EnableWebSecurity
@Configuration
@ComponentScan
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.antMatcher("/**").authorizeRequests()
	                .antMatchers("/", "/cars")
	                    .permitAll()
	                .anyRequest()
	                    .authenticated().and().oauth2Login();
	    }
}

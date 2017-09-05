package com.yarncoms.config;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.yarncoms.service.CustomUserDetailsService;
 
@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = CustomUserDetailsService.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
    private static String REALM="Yarncom";
    
    @Autowired
    private UserDetailsService userDetailsService;
     
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        //auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
        //auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
    	auth.userDetailsService(userDetailsService);//.passwordEncoder(passwordencoder());
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/rest/**").hasRole("ADMIN")
        //.antMatchers("/rest/**").hasRole("CLERK")
        //.antMatchers("/rest/tech/**").hasRole("TECHNICAL")
        .antMatchers(HttpMethod.OPTIONS, "/rest/**").permitAll()//hasRole("ANONYMOUS")
        .and().httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint())
        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//We don't need sessions to be created.
    }
     
    @Bean
    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
        return new CustomBasicAuthenticationEntryPoint();
    }
    
    /* To allow Pre-flight [OPTIONS] request from browser*/ 
    @Override
    public void configure(WebSecurity web) throws Exception {
       // web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
    }
    
    @Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
     return new BCryptPasswordEncoder();
    }
}
package com.example.demo_spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception{
        http.authorizeHttpRequests()
                .requestMatchers("/myAccount","/myBalance","/myCards","/myLoans","/Hello").authenticated()
                .requestMatchers("/notices","/contact").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return  http.build();
    }
/*
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception{
        http.authorizeHttpRequests().anyRequest().denyAll()
                .and().formLogin()
                .and().httpBasic();
        return  http.build();

        @Bean
        SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception{
            http.authorizeHttpRequests().anyRequest().permitAll()
                    .and().formLogin()
                    .and().httpBasic();
            return  http.build();
            */

    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//
//      UserDetails user = User.withDefaultPasswordEncoder()
//              .username("user")
//              .password("12456")
//              .authorities("user")
//              .build();
//
//      return new InMemoryUserDetailsManager(admin,user);

   /*   UserDetails admin = User.withUsername("admin")
              .password("123456")
              .authorities("admin")
              .build();

      return new InMemoryUserDetailsManager(admin);*/

       /*
        public UserDetailsService userDetailsService(DataSource dataSource){
            return  new JdbcUserDetailsManager(dataSource);
        }
  }*/
}

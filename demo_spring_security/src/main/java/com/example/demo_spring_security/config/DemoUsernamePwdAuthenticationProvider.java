package com.example.demo_spring_security.config;

import com.example.demo_spring_security.entity.Customer;
import com.example.demo_spring_security.repository.CustomerRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class DemoUsernamePwdAuthenticationProvider implements AuthenticationProvider{

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public Authentication authenticate(Authentication authentication) throws  ArithmeticException {

        String userName,password=null;
        userName=authentication.getName();
        password=authentication.getCredentials().toString();
        List<Customer> listes = customerRepository.findByEmail(userName);
        if(listes.size()>0){
            if(passwordEncoder.matches((password,listes.get(0).getPwd())){
                List<GrantedAuthority>authorities = new ArrayList<>();
                authorities.add((new SimpleGrantedAuthority(listes.get(0).getRole())));
                return  new UsernamePasswordAuthenticationToken(userName,password,authorities);
            }else {
                throw  new BadCredentialsException("invalid password");
            }
        }else {
            throw new BadCredentialsException("user note registered");

        }
    }
        @Override
        public boolean supports(Class<?> authentication){
        return
        }


           /* userName=listes.get(0).getEmail();
            password =listes.get(0).getPwd();
            authorities= new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(listes.get(0).getRole()));
        }*/

    }
}

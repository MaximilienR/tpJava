package com.example.demo_spring_security.config;

import com.example.demo_spring_security.entity.Customer;
import com.example.demo_spring_security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DemoSpringUserDetails implements UserDetailsService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        String userName,password=null;
        List<GrantedAuthority> authorities = null;
        List<Customer> listes = customerRepository.findAllByEmail(username);

        if(listes.size()==0){
            throw  new UsernameNotFoundException("User not foud"+username);
        }else {
            userName=listes.get(0).getEmail();
            password =listes.get(0).getRole();
            authorities= new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(listes.get(0).getRole()));
        }
                return null;
    }
}

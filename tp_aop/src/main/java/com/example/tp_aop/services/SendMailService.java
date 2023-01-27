package com.example.tp_aop.services;

import com.example.tp_aop.aspects.LogThis;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    public String send(){
        return "";
    }
    public String sendFails() throws Exception{
        throw new Exception("une error est survenu");
    }
    @LogThis
    public

    @LogThis(how="FAILL")
    public String failSend(){
        return "une error survenu";
    }
}

package com.intern.backend.backend.ot.oop.principle.srp.password;

import org.springframework.stereotype.Component;

import javax.naming.Name;

@Component
public class Sha256PasswordEncoder implements PasswordEncoder{
    @Override
    public String encrypt(String pw) {
        for(int i = 0 ; i < 17000 ; i++){
            System.out.println(i + " 번째 암호화");
        }
        return "sha256";
    }
}

package com.intern.backend.backend.ot.oop.principle.srp.password;

import org.springframework.stereotype.Component;

@Component
public class Sha256PasswordEncoder implements PasswordEncoder{
    @Override
    public String encrypt(String pw) {
        return "sha256";
    }
}

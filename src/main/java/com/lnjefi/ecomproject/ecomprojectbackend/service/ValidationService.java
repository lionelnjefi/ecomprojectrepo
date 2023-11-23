package com.lnjefi.ecomproject.ecomprojectbackend.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidationService {

    public boolean validatePassword(String pin) {
        String regex = "^(\\d{4}|\\d{6})$";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(pin);
        return matcher.matches();
    }
}

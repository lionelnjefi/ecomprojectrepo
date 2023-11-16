package com.lnjefi.ecomproject.ecomprojectbackend.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidationService {

    public boolean validatePassword(String pin) {
        String regex = "\\H\\d\\w{4}\\w{6}";

        final Pattern pattern = Pattern.compile(regex, Pattern.LITERAL);
        final Matcher matcher = pattern.matcher(pin);
        return matcher.find();
    }
}

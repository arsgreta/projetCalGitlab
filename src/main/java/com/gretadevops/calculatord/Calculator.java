package com.gretadevops.calculatord;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    int sum (int a , int b) {
        return a + b;
    }
}

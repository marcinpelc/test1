package com.example.test;

public class SomeService {


    public void notImportantMethod() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.hello;

/**
 * Hello world!
 *
 */

import hello.py.HelloKey;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String NEW_LICENSE_KEY = new HelloKey().getLicenseKey();
        System.out.println("Key from JAR: " + NEW_LICENSE_KEY);

    }
}

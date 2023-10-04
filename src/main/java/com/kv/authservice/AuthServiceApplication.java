package com.kv.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for the AuthService application.
 * This class serves as the entry point for starting the application.
 */
@SpringBootApplication()
public class AuthServiceApplication {

     /**
     * The main method of the AuthService application.
     * When executed, it initializes and runs the Spring Boot application.
     *
     * @param args An array of command-line arguments passed to the application (if any).
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }
}

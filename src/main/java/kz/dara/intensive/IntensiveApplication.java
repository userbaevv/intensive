package kz.dara.intensive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntensiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntensiveApplication.class, args);
        System.out.println("Hello word! Intensive");
    }

}

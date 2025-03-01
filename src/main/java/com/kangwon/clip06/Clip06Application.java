package com.kangwon.clip06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clip06Application {

    public static void main(String[] args) {
        SpringApplication.run(Clip06Application.class, args);

//        var publisher = new Publisher().startFlux().subscribe(System.out::println);
//        var publisher = new Publisher();
//        publisher.startMono()
//                .subscribe();
    }

}

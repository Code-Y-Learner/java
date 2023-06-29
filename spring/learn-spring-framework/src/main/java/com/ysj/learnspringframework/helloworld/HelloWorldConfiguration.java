package com.ysj.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {
}

record Address (String firstLine, String city){

}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ysj";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    @Primary
    public Person person() {
        // var person = new Person("seungjyu", 29);
        // return person;
        return new Person("ysj",29, address());
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), new Address("gae", "Gangnam"));
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
    @Bean(name = "address2")
    public Address address() {
        return new Address("omokro", "Seoul");
    }
}

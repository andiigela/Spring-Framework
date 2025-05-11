package com.andi.spring02corewiring.cydeo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Make");
        return c;
    }

    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Name");
        p.setCar(car); // auto wiring
        return p;
    }

    // Direct Wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Name");
//        p.setCar(car()); // direct wiring
//        return p;
//    }
}

package com.andi.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);
    }
}

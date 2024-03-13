package com.gdu.ioc.xml03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com/gdu/ioc/xml03/applicationContext.xml");

        MyController myController = ctx.getBean("myController", MyController.class);
        myController.add();
        ctx.close();
    }
}

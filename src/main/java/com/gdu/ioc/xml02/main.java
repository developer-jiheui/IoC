package com.gdu.ioc.xml02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("com/gdu/ioc/xml02/appCtx.xml");

        Student student = (Student) ctx.getBean("student");

        System.out.println(student.getContacts());
        System.out.println(student.getFriends());
        System.out.println(student.getScores());
    }
}

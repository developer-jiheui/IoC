package com.gdu.ioc.anno2;

import com.gdu.ioc.xml02.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void method1() {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = (Student) ctx.getBean("student");

        System.out.println(student.getContacts());
        System.out.println(student.getFriends());
        System.out.println(student.getScores());
    }

    public static void main(String[] args) {
        method1();
    }
}

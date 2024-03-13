package com.gdu.ioc.anno01;

import com.gdu.ioc.xml01.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {


    public static void method1(){
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Calculator calculator = ctx.getBean("calculator", Calculator.class);

        calculator.add(10,20);
        calculator.sub(10,5);
        calculator.mul(10,3);
        calculator.div(10,4);
    }

    public static void method2(){
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public static void main(String[] args) {
        method1();
    }
}

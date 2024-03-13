package com.gdu.ioc.anno03;

import com.gdu.ioc.xml03.MyController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
          AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyController myController = ctx.getBean("myController", MyController.class);
        myController.add();
        ctx.close();
    }
}

package com.gdu.ioc.anno01;

import com.gdu.ioc.xml01.Calculator;
import com.gdu.ioc.xml01.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // IoC Container 에 bean 을 등록하는 클래스
public class AppConfig {

    /*
     * 메소드 반환타입  : bean 의 타입, <bean class="">
     * 메소드명        : bean의 이름, <bean id ="">
     * */
    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    //rarely use those
    /*
    @Bean(name = "calculator")
    public Calculator method1(){
        return new Calculator();
    }
    */

    public Computer computer1(){
        Computer computer1 = new Computer();
        computer1.setModel("gram");
        computer1.setPrice(200);
        computer1.setCalculator(calculator());
        return computer1;
    }

    public Computer computer2(){
        return new Computer("macbook",300, calculator());
    }

}

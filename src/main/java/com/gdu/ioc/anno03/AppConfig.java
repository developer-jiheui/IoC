package com.gdu.ioc.anno03;

import com.gdu.ioc.xml03.MyConnection;
import com.gdu.ioc.xml03.MyController;
import com.gdu.ioc.xml03.MyDao;
import com.gdu.ioc.xml03.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public MyConnection myConnection(){
        MyConnection myConnection = new MyConnection();
        myConnection.setDriver("oracle.jdbc.OracleDriver");
        myConnection.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        myConnection.setUser("GD");
        myConnection.setPassword("1111");

        return myConnection;
    }
    @Bean
    public MyDao myDao(){
        MyDao myDao = new MyDao();
        myDao.setMyConnection(myConnection());
        return myDao;
    }

    @Bean
    public MyService myService(){
        MyService myService = new MyService();
        myService.setMyDao(myDao());
        return myService;
    }

    @Bean
    public MyController myController(){
        MyController myController = new MyController();
        myController.setMyService(myService());
        return myController;
    }

}

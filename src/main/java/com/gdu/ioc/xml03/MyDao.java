package com.gdu.ioc.xml03;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.Connection;

@NoArgsConstructor
@Data
public class MyDao {

    private Connection connection;
    private MyConnection myConnection;

// bean으로 대채
//    private Connection getConnection(){
//        Connection con = null;
//
//        AbstractApplicationContext ctx = new GenericXmlApplicationContext("com/gdu/ioc/xml03/applicationContext.xml");
//        myConnection = ctx.getBean("myConnection", MyConnection.class);
//        con = myConnection.getConnection();
//        ctx.close();
//        return con;
//    }

    public void close(){
        try{//connection은 try객체가 잇어야만 한다.
            if(connection != null){
                connection.close();
                System.out.println(myConnection.getUser() + "접속해제되었습니다");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void add(){
        connection = myConnection.getConnection();
        System.out.println("myDao add 호출");
        myConnection.close();
    }

}

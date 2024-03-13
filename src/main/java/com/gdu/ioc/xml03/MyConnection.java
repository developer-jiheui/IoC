package com.gdu.ioc.xml03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyConnection {

    private String driver;
    private String url;
    private String user;
    private String password;

    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println(user + "접속되었습니다.");
        } catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public void close() {
    }
}

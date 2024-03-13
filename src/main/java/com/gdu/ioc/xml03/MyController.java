package com.gdu.ioc.xml03;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MyController {

    private MyService myService;

    public void add(){
        myService.add();
        System.out.println("MyController  add() 호출");
    }
}

package com.gdu.ioc.anno2;

import com.gdu.ioc.xml02.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        Student student = new Student();

        student.setScores(Arrays.asList(90,91,92));
        student.setContacts(new HashSet<>(Arrays.asList("02-111-1111","010-222-2222")));
        student.setFriends(Map.of("동네친구", "길동","운동친구","또치"));
        return student;
    }

}

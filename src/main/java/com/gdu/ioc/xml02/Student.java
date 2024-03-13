package com.gdu.ioc.xml02;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@Data
public class Student {
    private List<Integer> scores;
    private Set<String> contacts;
    private Map<String, String> friends;
}

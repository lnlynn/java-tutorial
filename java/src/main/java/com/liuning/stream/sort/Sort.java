package com.liuning.stream.sort;

import java.util.*;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setName("陈奕迅");
        user1.setAge(45);
        user1.setBirthDay(new Date(1974, Calendar.NOVEMBER,20));
        list.add(user1);

        User user2 = new User();
        user2.setName("张学友");
        user2.setAge(57);
        user2.setBirthDay(new Date(1964, Calendar.SEPTEMBER,6));
        list.add(user2);

        System.out.println("按照年龄从小到大排序结果：");
        list.sort(Comparator.comparing(User::getAge));
        System.out.println(list);

        System.out.println("按照出生日期排反序：");
        List<User> sortedList = list.stream().sorted(Comparator.comparing(User::getBirthDay).reversed()).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}

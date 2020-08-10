package com.liuning.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author liuning
 * @description Date LocalDate LocalDateTime
 * @since 2020-08-10 23:29
 */
public class DateFormat {

    public static void main(String[] args) {
        //Mon Aug 10 23:31:07 CST 2020
        System.out.println(new Date());
        //2020-08-10
        System.out.println(LocalDate.now());
        //2020-08-10T23:31:07.160
        System.out.println(LocalDateTime.now());
    }
}

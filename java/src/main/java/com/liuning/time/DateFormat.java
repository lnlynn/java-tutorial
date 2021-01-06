package com.liuning.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.StreamSupport;

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

        System.out.println();

        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(1609946327);
        System.out.println("date1：" + date1.toLocaleString());
        System.out.println("date2：" + date2.toLocaleString());

        System.out.println();

        System.out.println("日期比较：");
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));

    }
}

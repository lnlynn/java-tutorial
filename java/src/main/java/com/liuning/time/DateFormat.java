package com.liuning.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

        LocalDate afterDate = LocalDate.of(2021, 1, 9);
        LocalDate beforeDate = LocalDate.of(2019, 2, 10);
        //月数
        long betweenMONTHS = ChronoUnit.MONTHS.between(beforeDate, afterDate);
        //年数
        long between1YEARS = ChronoUnit.YEARS.between(beforeDate, afterDate);
        //天数
        long between1DAYS = ChronoUnit.DAYS.between(beforeDate, afterDate);
        System.out.println(betweenMONTHS);
        System.out.println(between1YEARS);
        System.out.println(between1DAYS);

        LocalDateTime localDateTime = LocalDateTime.now().plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("日期格式化：" + localDateTime.format(formatter));
        LocalDateTime dateTime = LocalDateTime.parse("2018-07-02 16:39:37", formatter);
        System.out.println("日期转换：" +dateTime);
    }
}

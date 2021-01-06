package com.liuning.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * LocaiDateTime
 *
 * @author liuning
 * @since 2020-09-07 22:49
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);

        Date nowDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDateTime转Date：" + nowDate);

        Date date = new Date(System.currentTimeMillis());
        LocalDateTime localDateTime = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Date转LocalDateTime：" + localDateTime);

        System.out.println(LocalDateTime.of(2020, Month.APRIL, 20, 15, 18));
        System.out.println(LocalDateTime.parse("2018-07-02T16:39"));

        System.out.println("30分钟后：" + LocalDateTime.now().plusMinutes(30));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2018-07-02 16:39:37", formatter);
        System.out.println("日期转换：" +dateTime);
    }
}

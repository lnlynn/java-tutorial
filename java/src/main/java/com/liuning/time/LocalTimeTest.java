package com.liuning.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * LocalTime
 *
 * @author liuning
 * @since 2020-09-07 22:40
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("当前时间：" + localTime);

        System.out.println(LocalTime.of(20,10,2));
        System.out.println(LocalTime.parse("20:30"));

        LocalTime nowTime = LocalTime.now();
        System.out.println("小时：" + nowTime.getHour());
        System.out.println("分钟：" + nowTime.getMinute());

        System.out.println("半个小时后：" + LocalTime.now().plus(30, ChronoUnit.MINUTES));
    }
}

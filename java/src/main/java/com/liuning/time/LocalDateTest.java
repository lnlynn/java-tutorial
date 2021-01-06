package com.liuning.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

/**
 * LocalDate
 *
 * @author liuning
 * @since 2020-09-07 21:52
 */
public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期：" + localDate);
        System.out.println("年：" + localDate.getYear());
        System.out.println("月：" + localDate.getMonthValue());
        System.out.println("日：" + localDate.getDayOfMonth());

        System.out.println(LocalDate.of(2018,7,2));
        System.out.println(LocalDate.parse("2019-08-20").getDayOfMonth());

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("明天日期：" + tomorrow);

        LocalDate preMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("上月日期：" + preMonth);

        DayOfWeek dayOfWeek = LocalDate.parse("2020-09-07").getDayOfWeek();
        System.out.println("2020-09-07是星期:" + dayOfWeek.getValue()+ "-" + dayOfWeek);

        boolean isBefore = LocalDate.now().isBefore(LocalDate.parse("2020-12-31"));
        System.out.println(isBefore);

        MonthDay monthDayNow = MonthDay.from(LocalDate.now());
        MonthDay birthDay = MonthDay.of(12, 4);
        System.out.println(monthDayNow.equals(birthDay));

        System.out.println("计算时间间隔：");

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
    }
}

package com.liuning.bugs;

/**
 * String.valueOfh的bug
 *
 * @author liuning
 * @since 2020-10-09 23:48
 */
public class StringValueOf {

    /**
     * public static String valueOf(Object obj) {
     *     return (obj == null) ? "null" : obj.toString();
     * }
     * 当传入对象为空时，String.valueOf会返回"null"字符串
     */
    public static void main(String[] args) {
        User user = null;
        System.out.println(String.valueOf(user));
    }

    public static class User {
        private String name;
    }
}

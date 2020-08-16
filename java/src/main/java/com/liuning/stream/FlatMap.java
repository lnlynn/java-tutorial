package com.liuning.stream;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * flatMap方法可用Stream替换值，然后将多个Stream连接成一个Stream
 *
 * @author liuning
 * @since 2020-08-16 11:47
 */
public class FlatMap {

    public static void main(String[] args) {

        //将两个List进行合并
        List<People> together = Stream.of(Arrays.asList(new People("张学友", 55), new People("刘德华", 56)),
                Arrays.asList(new People("黎明", 54), new People("郭富城", 53)))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(together));

        //将List里面对象的属性进行合并
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("张学友", new ArrayList<>(Arrays.asList(30, 40))));
        peoples.add(new People("刘德华", new ArrayList<>(Arrays.asList(70, 80))));
        List<Integer> albums = peoples.stream()
                .flatMap(people -> people.getAlbums().stream())
                .collect(Collectors.toList());
        System.out.println(albums);
    }

    public static class People {

        private String name;

        private Integer age;

        private List<Integer> albums;

        public People(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public People(String name, List<Integer> albums) {
            this.name = name;
            this.albums = albums;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<Integer> getAlbums() {
            return albums;
        }

        public void setAlbums(List<Integer> albums) {
            this.albums = albums;
        }
    }
}

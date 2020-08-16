package com.liuning.stream.entity;

/**
 * @author liuning
 * @description Track 歌曲
 * @since 2020-08-16 13:57
 */
public class Track {

    private String name;

    private Integer length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}

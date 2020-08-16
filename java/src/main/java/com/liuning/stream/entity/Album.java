package com.liuning.stream.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuning
 * @description Album 专辑
 * @since 2020-08-16 13:57
 */
public class Album {

    private String name;

    private List<Track> trackList;

    public Album(String name, ArrayList<Track> trackList) {
        this.name = name;
        this.trackList = trackList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", trackList=" + trackList +
                '}';
    }
}

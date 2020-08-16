package com.liuning.stream;

import com.liuning.stream.entity.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author liuning
 * @description Stream Max And Min
 * @since 2020-08-16 14:02
 */
public class MaxAndMin {

    public static void main(String[] args) {

        List<Track> tracks = Arrays.asList(new Track("一丝不挂", 68),
                new Track("陀飞轮", 56),
                new Track("不想放手", 98));

        Track max = tracks.stream()
                .max(Comparator.comparing(Track::getLength))
                .get();
        System.out.println(max);

        Track min = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println(min);
    }
}

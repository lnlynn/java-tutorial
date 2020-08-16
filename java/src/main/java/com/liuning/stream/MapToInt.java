package com.liuning.stream;

import com.liuning.stream.entity.Album;
import com.liuning.stream.entity.Track;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

/**
 * @author liuning
 * @description map
 * @since 2020-08-16 16:01
 */
public class MapToInt {

    public static void main(String[] args) {

        Album album = new Album("Time Files", new ArrayList<Track>() {{
            add(new Track("一丝不挂", 68));
            add(new Track("陀飞轮", 48));
            add(new Track("无人之境", 59));
        }});

        IntSummaryStatistics trackStatistics = album.getTrackList().stream()
                .mapToInt(track -> track.getLength())
                .summaryStatistics();
        System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                trackStatistics.getMax(),
                trackStatistics.getMin(),
                trackStatistics.getAverage(),
                trackStatistics.getSum());

    }
}


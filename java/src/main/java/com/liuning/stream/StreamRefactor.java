package com.liuning.stream;

import com.alibaba.fastjson.JSON;
import com.liuning.stream.entity.Album;
import com.liuning.stream.entity.Track;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liuning
 * @description 使用Stream进行重构的一个例子
 * @since 2020-08-15 23:28
 */
public class StreamRefactor {

    public static void main(String[] args) {

        Album albumOne = new Album("不想放手", new ArrayList<Track>() {{
            add(new Track("不要说话", 70));
            add(new Track("路，一直都在", 50));
            add(new Track("土星环", 19));
        }});

        Album albumTwo = new Album("上五楼的快活", new ArrayList<Track>() {{
            add(new Track("心的距离", 42));
            add(new Track("你为什么哭了呢", 54));
            add(new Track("从何说起", 78));
        }});

        Album albumThree = new Album("Time Files", new ArrayList<Track>() {{
            add(new Track("一丝不挂", 68));
            add(new Track("陀飞轮", 48));
            add(new Track("无人之境", 59));
        }});

        List<Album> albums = new ArrayList<>(Arrays.asList(albumOne, albumTwo, albumThree));
        System.out.println(JSON.toJSONString(albums));

        //过滤出每张专辑中长度大于1分钟的歌曲
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    trackNames.add(track.getName());
                }
            }
        }
        System.out.println(trackNames);

        System.out.println("使用forEach进行重构：");
        Set<String> trackNamesOne = new HashSet<>();
        albums.forEach(album ->
                album.getTrackList().forEach(track -> {
                    if (track.getLength() > 60) {
                        trackNamesOne.add(track.getName());
                    }
                }));
        System.out.println(trackNamesOne);

        Set<String> trackNamesTwo = new HashSet<>();
        albums.forEach(album ->
                album.getTrackList().stream()
                        .filter(track -> track.getLength() > 60)
                        .map(track -> track.getName())
                        .forEach(name -> trackNamesTwo.add(name))
        );
        System.out.println(trackNamesTwo);

        Set<String> trackNamesFour = albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLength() > 60)
                .map(Track::getName)
                .collect(Collectors.toSet());
        System.out.println(trackNamesFour);

    }

}

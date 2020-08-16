package com.liuning.stream;

import com.liuning.stream.entity.Track;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author liuning
 * @description Stream count
 * @since 2020-08-16 14:46
 */
public class Count {

    public static void main(String[] args) {

        List<Track> tracks = Arrays.asList(new Track("一丝不挂", 68),
                new Track("陀飞轮", 56),
                new Track("不想放手", 98));

        //内部迭代，该方法不是返回一个控制迭代的Iterator对象，而是返回内部迭代中的相应接口：Stream。
        long count = tracks.stream()
                .filter(track -> track.getLength() > 60)
                .count();
        System.out.println(count);

        //Iterator外部迭代，for循环其实是Iterator的语法糖
        int num = 0;
        Iterator<Track> iterator = tracks.iterator();
        while (iterator.hasNext()) {
            Track track = iterator.next();
            if (track.getLength() > 60) {
                num++;
            }
        }
        System.out.println(num);

        int count2 = Stream.of(1, 2, 3)
                .reduce(0,(acc,element)-> acc + element);
        System.out.println(count2);

        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        System.out.println(accumulator.apply(99,2));

    }
}

package com.liuning.ChainOfResponsibilityPattern;

import com.liuning.ChainOfResponsibilityPattern.impl.HebeiOfficial;
import com.liuning.ChainOfResponsibilityPattern.impl.ShangdongOfficial;

import java.util.LinkedList;
import java.util.List;

/**
 * 责任链模式
 */
public class PrimeMinister {

    private static final List<Official> list = new LinkedList<>();

    public static void main(String[] args) {
        // 下令沿途各省官员准备好
        list.add(new HebeiOfficial());
        list.add(new ShangdongOfficial());
        // 请出皇上
        Emperor emperor = Emperor.getInstance();
        // 昭告天下：万岁爷起驾下江南！沿途各省依次伺候圣上
        System.out.println("乾隆下江南!");
        start(list, emperor);
    }

    private static void start(List<Official> officials, Emperor emperor) {
        for (Official official : officials) {
            official.serve(emperor);
        }
    }
}

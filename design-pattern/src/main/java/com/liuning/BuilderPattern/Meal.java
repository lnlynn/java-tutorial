package com.liuning.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal
 *
 * @author liuning
 * @since 2020-09-18 23:36
 */
public class Meal {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
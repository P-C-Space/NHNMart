package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    public void add(String addList){
        StringTokenizer st = new StringTokenizer(addList);
        while(st.hasMoreTokens()){ // 다음 토큰이 없다면
            String name = st.nextToken();
            int amount = Integer.valueOf(st.nextToken());
            items.add(new Item(name, amount));
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount){
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}

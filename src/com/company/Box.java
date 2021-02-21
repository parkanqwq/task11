package com.company;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruit = new ArrayList<>();

    public void addCoreFruit(T fruit) {
        this.fruit.add(fruit);
    }

    public double getWeight(){
        if(fruit.size() == 0) return 0.0;
        return fruit.size() * fruit.get(0).getWeight();
    }

    public int getCoreFruit(){
        return fruit.size();
    }

    public boolean compare(Box<?> compare){
        if (getWeight() == compare.getWeight()) return true;
        return false;
    }

    public void transferTo(Box<T> box){
        for (T el: fruit) {
            box.addCoreFruit(el);
        }
        fruit.clear();
    }
}

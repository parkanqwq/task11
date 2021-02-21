package com.company;

public class Box <T extends Fruit> {

    private T fruit;
    private int core;

    public Box(T fruit, int core) {
        this.fruit = fruit;
        this.core = core;
    }

    public void addCoreFruit(int core) {
        if (core < 0) {
            System.out.println("Нельзя положить в коробку отрицательное число фруктов");
            return;
        }
        this.core += core;
    }

    public double getWeight() {
        return core * fruit.getWeight();
    }

    public int getCoreFruit(){
        return core;
    }

    public boolean compare(Box<?> compare){
        if (getWeight() == compare.getWeight()) return true;
        return false;
    }

    public void inBoxInBox(Box box){
        this.core +=box.core;
        box.core = 0;
    }
}

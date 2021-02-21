package com.company;

import java.util.*;

public class Main {

    private static String[] arrString = new String[3];
    private static Integer[] arrInt = new Integer[3];

    public static void main(String[] args) {

        System.out.println();
        System.out.print("Задание 1");
        createInArr();
        printFirstTask();
        System.out.println();
        System.out.println("Задание 2");
        System.out.println(inArralist(arrString));
        System.out.println();
        System.out.println("Задание 3");
        task3();
    }

    public static void task3(){
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple = new Box<>(apple, 4);
        Box<Orange> boxOrange = new Box<>(orange, 4);
        Box<Apple> appleBox = new Box<>(apple,0);
        appleBox.addCoreFruit(apple,1);
        System.out.println(boxApple.getWeight() + " вес коробки с яблоками 1, " + boxApple.getCoreFruit() + " яблока");
        System.out.println(boxOrange.getWeight() + " вес коробки с апельсинами 1, " + boxOrange.getCoreFruit() + " апельсина");
        System.out.println(boxApple.compare(boxOrange) + " сравнение коробки, яблоки и апельсины 1 и 1");
        System.out.println(appleBox.getWeight() + " вес коробки с яблоками 2, " + appleBox.getCoreFruit() + " яблока");
        boxApple.inBoxInBox(appleBox);
        boxApple.addCoreFruit(apple,1);
        System.out.println("Переспали яблоки из 2 коробки в 1 и добавили 1 яблоко");
        System.out.println(boxApple.getWeight() + " вес коробки яблоки 1 стал после пересыпания, " + boxApple.getCoreFruit() + " яблока");
        System.out.println(appleBox.getWeight() + " вес коробки яблоки 2, " + appleBox.getCoreFruit() + " яблока");
        System.out.println(boxApple.compare(boxOrange) + " сравнение яблоки и апельсины 1 и 1");

    }

    private static <T> List inArralist(T[] arr){
        List list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }

    private static void printFirstTask() {
        System.out.println();
        System.out.println(Arrays.toString(arrString));
        System.out.println(Arrays.toString(arrInt));
        System.out.println();
        changeArr(arrString, 0, 1);
        changeArr(arrInt, 1, 2);
        System.out.println(Arrays.toString(arrString));
        System.out.println(Arrays.toString(arrInt));
    }

    private static <V> V[] changeArr(V[] arr, int t1, int t2) {
        V arrTest;
        arrTest = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = arrTest;
        return arr;
    }

    private static void createInArr() {
        arrString[0] = " world";
        arrString[1] = "Hello";
        arrString[2] = "!";
        arrInt[0] = 0;
        arrInt[1] = 2;
        arrInt[2] = 1;
    }

}
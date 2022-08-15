package com.sparta.ge;

//<> placeholders for generic types
//create a class without knowing the data type
public class TheBox<T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        //? --> represents the wild cart
        //? extends Number
        TheBox<Integer> box = new TheBox<>();
        box.setT(10);
        System.out.println(box.getT());
    }
}

package com.sparta.ge;

public class App{
    public static void main( String[] args ){
    }

    private static Object strangeMethod(Object object){
        return object.hashCode() < 1000;
    }
}

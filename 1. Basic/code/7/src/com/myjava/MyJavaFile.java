package com.myjava;

import com.mykotlin.MyCustomKotlineFileName;

public class MyJavaFile {
    public static void main(String[] args) {
        int sum = MyCustomKotlineFileName.add(3, 4);
        System.out.println("Printing Sum From Java File : " + sum);
        int volume = MyCustomKotlineFileName.findVolume(3, 4);
        System.out.println("Printing Vale From Java File : " + volume);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}

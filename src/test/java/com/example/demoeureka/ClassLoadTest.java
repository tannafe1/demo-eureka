package com.example.demoeureka;

public class ClassLoadTest {
    private static  ClassLoadTest test = new  ClassLoadTest();

    static int x;
    static int y = 0;

    public ClassLoadTest() {
        x++;
        y++;
    }

    public static void main(String[] args) {
        System.out.println("test.x="+test.x);
        System.out.println("test.y="+test.y);
        y++;
        System.out.println("test.y2="+test.y);
        //test.x=1
        //test.y=0
        //test.y2=1
        //sfjslfjsdfsfd====================
    }
}

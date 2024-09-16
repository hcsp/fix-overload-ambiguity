//package com.github.hcsp.objectbasic;
import java.util.HashMap;
class Main{
    static void print(int i,int kd, int j, int k) {
        System.out.println("I'm int!");
    }

    static void print(Integer i,Integer j) {
        System.out.println("I'm Integer!");
    }

    static void print(Number i,Number j,Number k) {
        System.out.println("I'm Number!");
    }

    static void print(Object i,Object k, Object l, Object e) {
        System.out.println("I'm Object!");
    }
    static void print(HashMap i) {
        System.out.println("I'm HashMap!");
    }
    public static void main(String args[]) {
        // ??????????,?????????print(HashMap)
        print(null);
    }
}

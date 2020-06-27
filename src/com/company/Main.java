package com.company;
import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       Map <Integer,String> countries = new HashMap<Integer, String>();
       countries.put(1,"England");
       countries.put(2,"USE");
       countries.put(3,"UEA");
       String use = countries.get(2);
       System.out.println(use);
    }
}

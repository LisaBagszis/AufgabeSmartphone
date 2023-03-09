package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact friend1 = new Friend("Hans", "015774243273");
        System.out.println(friend1);
        ArrayList<Contact> list = new ArrayList<>();
        list.add(0, friend1);
        Smartphone firstSmartphone = new Smartphone("Iphone 10", "Apple", list);
        System.out.println(firstSmartphone.getPosition());
        System.out.println(firstSmartphone.startRadio());
        System.out.println(firstSmartphone.stopRadio());
    }
}
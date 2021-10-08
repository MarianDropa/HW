package HW6;

import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        numbers.add(18);
        numbers.add(20);
        numbers.add(22);
        numbers.removeIf(s -> s % 3 == 0);
        System.out.println(numbers);

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Grapefruit");
        fruits.add("Orange");
         if (fruits.contains("Orange")) {
             Collections.replaceAll(fruits, "Orange", "Grapefruit");
         }else {
             System.out.println("Value Orange not present");
         }
        System.out.println(fruits);

        ArrayList<Integer> data1 = new ArrayList<>();
        data1.add(5);
        data1.add(8);
        data1.add(-2);
        data1.add(0);
        data1.add(3);
        ArrayList<Integer> data2 = new ArrayList<>();
        data2.add(5);
        data2.add(0);
        data2.add(1);
        data2.add(3);
        data2.add(15);
        data1.retainAll(data2);
        System.out.println(data1);
    }
}

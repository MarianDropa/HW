package HW5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        list1.add(10);
        list1.add(8);
        list1.add(5);
        list1.add(9);
        list1.add(12);
        Integer largest = list1.largest();
        System.out.println("The largest value in the array is " + largest);
        Integer smallest = list1.smallest();
        System.out.println("The smallest value in the array is " + smallest);
    }
}

class MyList<T extends Number & Comparable<T>> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T number) {
        list.add(number);
    }

    public T largest() {
        T large = list.get(0);
        for (T t : list) {
            if (t.compareTo(large) > 0)
                large = t;
        }
        return large;
    }

    public T smallest() {
        T small = list.get(0);
        for (T t : list) {
            if (t.compareTo(small) < 0)
                small = t;

        }
        return small;
    }
}

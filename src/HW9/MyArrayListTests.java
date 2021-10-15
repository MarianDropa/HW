package HW9;


public class MyArrayListTests {
    public static void main(String[] args) {
        checkArrayIsEmpty();
        checkIfArrayIsAddingElements();
        checkIfArrayIsAddingElementsToItsEnd();
        checkIfArrayRemovingElement();
        checkIfArrayIsAddingElementToIndex();
        checkIfParticularElementIsInArray();
        checkArrayIndexOutOfBounds();
    }

    static void checkArrayIsEmpty() {
        MyArrayList a = new MyArrayList();
        if (a.size() <= 0)
            System.out.println("The ArrayList is empty: " + a.isEmpty());
        System.out.println("*************");
    }

    static void checkIfArrayIsAddingElements() {
        MyArrayList b = new MyArrayList();
        b.add(5);
        if (b.contains(5))
            System.out.println("The Array has added element on index " + b.indexOf(5));
        System.out.println("The Number of elements in array is: " + b.size());
        System.out.println("*************");
    }

    static void checkIfArrayIsAddingElementsToItsEnd() {
        MyArrayList c = new MyArrayList();
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(52145);
        if (c.contains(52145))
            System.out.println("The Array has added element to its end " + c.indexOf(52145));
        System.out.println("The Number of elements in array is: " + c.size());
        System.out.println("*************");
    }

    static void checkIfArrayRemovingElement() {
        MyArrayList d = new MyArrayList();
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println("Element at index 1 before removal: " + d.get(1));
        System.out.println("The Number of elements in array is: " + d.size());
        d.remove(d.get(1));
        System.out.println("Element at index 5 after removal: " + d.get(1));
        System.out.println("The Number of elements in array is: " + d.size());
        System.out.println("*************");
    }

    static void checkIfArrayIsAddingElementToIndex() {
        MyArrayList e = new MyArrayList();
        e.add(0, 2);
        e.add(1, 3);
        e.add(2, 4);
        e.add(3, 5);
        System.out.println("Element at index 2 before = " + e.get(2));
        e.add(2, 15);
        System.out.println("Element at index 2 after = " + e.get(2));
        System.out.println("Element at index 3 after = " + e.get(3));
        System.out.println("*************");
    }

    static void checkIfParticularElementIsInArray() {
        MyArrayList f = new MyArrayList();
        f.add(5);
        f.add(6);
        f.add(7);
        f.add(8);
        System.out.println("Is 7 in array? " + f.contains(7));
        System.out.println("*************");

    }

    static void checkArrayIndexOutOfBounds() {
        MyArrayList g = new MyArrayList();
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);
        System.out.println(g.get(22));
    }
}







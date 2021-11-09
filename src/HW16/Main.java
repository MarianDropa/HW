package HW16;


public class Main {
    public static void main(String[] args) {

        Multithreading mt = new Multithreading();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });

        t1.start();
        t2.start();
    }
}

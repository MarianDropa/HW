package HW16;

public class Multithreading {

    private int counter = 1;
    private int N = 20;

    public void printOddNumber() {

        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("Thread1 - " + counter + "\n");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {

        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("Thread2 - " + counter+ "\n");
                counter++;
                notify();
            }
        }
    }
}

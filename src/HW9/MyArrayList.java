package HW9;


public class MyArrayList {

    private Object[] myArrayList;
    private int elementsInArray;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int n) {
        if (n <= 0) {
            System.out.println("The size must be > 0");
            return;
        }
        this.myArrayList = new Object[n];
        this.elementsInArray = 0;
    }

    public void add(Object x) {
        if (checkIfArrayFull()) {
            copyArray(0, "double");
        }
        this.myArrayList[this.elementsInArray] = x;
        this.elementsInArray++;
    }

    public void add(int index, Object x) {
        if (checkIfArrayFull()) {
            copyArray(0, "double");
        }

        if (index >= this.myArrayList.length) {
            System.out.println("The index is out of bounds");
            System.exit(-1);
        }

        Object temp = this.myArrayList[index];
        myArrayList[index] = x;

        Object temp2;

        for (int i = index; i < this.myArrayList.length - 1; i++) {
            temp2 = myArrayList[i + 1];
            myArrayList[i + 1] = temp;
            temp = temp2;
        }

        copyArray(0, "");
        this.elementsInArray++;
    }

    public Object get(int index) {
        Object element = null;
        try {
            element = this.myArrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index that you specified is not within bounds.");
            System.exit(-1);
        }
        return element;
    }

    public int size() {
        return this.elementsInArray;
    }

    public boolean isEmpty() {
        return this.elementsInArray == 0;
    }

    public boolean contains(Object ob) {
        return indexOf(ob) >= 0;
    }

    public int indexOf(Object n) {
        for (int i = 0; i < this.myArrayList.length; i++) {
            if (n.equals(this.myArrayList[i])) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object n) {
        for (int i = 0; i < this.myArrayList.length; i++) {
            if (n.equals(this.myArrayList[i])) {
                this.myArrayList[i] = null;
                this.elementsInArray--;
                copyArray(0, "");
                return;
            }
        }
    }

    private boolean checkIfArrayFull() {
        return this.myArrayList.length == this.elementsInArray;
    }

    private void copyArray(int size, String action) {
        size = increaseArraySize(size, action);
        Object[] tempArray = new Object[size];
        int tempElement = 0;
        for (int i = 0; i < myArrayList.length; i++, tempElement++) {
            if (this.myArrayList[i] == null) {
                tempElement--;
                continue;
            }
            tempArray[tempElement] = this.myArrayList[i];
        }
        this.myArrayList = null;
        this.myArrayList = new Object[tempArray.length];
        this.myArrayList = tempArray;
    }

    private int increaseArraySize(int size, String action) {
        if (action.equals("double")) {
            size = this.myArrayList.length * 2;
        } else {
            size = this.myArrayList.length + size;
        }
        return size;
    }
}

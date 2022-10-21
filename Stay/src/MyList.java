import javax.swing.*;
import java.util.Arrays;

public class MyList<T> {
    private T[] arr;
    private int capacity = 10;
    private int index;

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList() {

        this.arr = (T[]) new Object[capacity];
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int size() {
        return index;
    }

    public void add(T data) {
        if (index == this.capacity) {
            T[] newArr = (T[]) new Object[capacity * 2];
            int i = 0;
            for (T arr : this.arr) {
                newArr[i] = arr;
                i++;
            }
            this.arr = newArr;
            this.capacity = this.capacity * 2;
        }
        arr[index] = data;
        index++;
    }

    public T get(int index) {
        if (index > size() || index < 0) {
            return null;
        }
        return this.arr[index];
    }

    public T remove(int index) {
        this.index--;
        if (index < 0 || index > this.index) {
            return null;
        } else {
            T deleteIndexValue = this.arr[index];
            for (int i = index; i < this.index; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.arr[size()] = null;
            return deleteIndexValue;
        }
    }

    public T set(int index, T data) {
        if (index > size() || index < 0) {
            return null;
        }
        this.arr[index] = data;
        return this.arr[index];

    }

    public String toString() {

        return "My list : " + Arrays.toString(arr);
    }

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndex(T data) {
        for (int i = size(); i >= 0; i--) {
            if (this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    boolean isEmpty() {

        return index == 0 ? true : false;

    }

    public T[] toArr() {
        return this.arr;
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            this.arr[i] = null;
        }

    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> newMyList = new MyList<>();
        for (int i = start; i < finish +1; i++) {
            newMyList.add(this.arr[i]);
        }
        return newMyList;
    }

    boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.arr[i] == data)
                return true;
        }
        return false;
    }


}

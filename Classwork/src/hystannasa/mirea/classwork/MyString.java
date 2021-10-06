package hystannasa.mirea.classwork;

import java.util.Arrays;

public class MyString {
    private final char c[];
    MyString(char[] c) {
        this.c = c;
    }

    public MyString concat(MyString str) {
        char[] st = new char[str.c.length+this.c.length];
        MyString mst = new MyString(st);
        int count = 0;
        for(int i = 0; i < this.c.length; i++) {
            st[i] = this.c[i];
            count++;
        }
        for(int j = 0; j<str.c.length; j++) {
            st[count++] = str.c[j];
        }
        return mst;
    }
    void print() {
        for(int i = 0; i < c.length; i++)
        {
            System.out.print(c[i]);
        }
    }
    char CharAt(int index) {
        return c[index];
    }
    boolean isEmpty() {
        if (c.length == 0) return true;
        else return  false;
    }
    MyString trim() {
        int count = 0;
        char[] src = new char[c.length];
        for (int i = 0; i < c.length; i++)
            if (c[i] == 0){
                ++count;

            } else src[i - count] = c[i];
        MyString mc = new MyString(src);
        return mc;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(c, myString.c);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(c);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.c);
    }

}
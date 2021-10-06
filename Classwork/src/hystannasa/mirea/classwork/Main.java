package hystannasa.mirea.classwork;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString("Roman".toCharArray());

        myString.trim();
        myString = myString.concat(new MyString(" Sannikov".toCharArray()));

        myString.print();
        System.out.println(myString);
    }
}

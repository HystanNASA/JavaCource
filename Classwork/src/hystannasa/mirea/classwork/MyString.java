package hystannasa.mirea.classwork;

public final class MyString {
    private final char[] string;

    public MyString(char[] string) {
        this.string = string;
    }

    public MyString(String string) {
        this.string = string.toCharArray();
    }

    public MyString concat(String string2) {
        return MyString(string + string2.toCharArray());
    }

    public String concat(char[] string2) {
        return string.toString() + string2.toString();
    }

    public char charAt(int index) {
        if(index >= 0) {
            return string[index];
        }
        else
            return 0;
    }

    public boolean equals(MyString string2) {
        return string.toString() == string2.toString() ? true : false;
    }

    public void trim() {
        string.toString().trim();
    }

    public boolean isEmpty() {
        return string.toString().isEmpty();
    }

    @Override
    public String toString() {
        return string.toString();
    }
}

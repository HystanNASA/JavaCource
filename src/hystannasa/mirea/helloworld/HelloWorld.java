package hystannasa.mirea.helloworld;

import java.util.Scanner;
import java.lang.String;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Person person = new Person();

        person.setName();
        person.setAge();
        person.setHeight();
        person.info();
    }
}

class Person
{
    private final int MAX_AGE = 200;
    private final double MAX_HEIGHT = 3;

    private int age;
    private float height;
    private String name;
    private Scanner scanner = new Scanner(System.in);
    private boolean isNameValid = false;
    private boolean isAgeValid = false;
    private boolean isHeightValid = false;

    public void setAge() {
        System.out.print("Enter age: ");

        do {
            age = scanner.nextInt();

            if(age >= MAX_AGE || age < 0) {
                System.out.print("The age is incorrect. Please, enter the correct age: ");
            }
        } while(age >= MAX_AGE || age < 0);

        isAgeValid = true;
    }

    public void setName() {
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        isNameValid = true;
    }

    public void setHeight() {
        System.out.print("Enter height: ");

        do {
            height = scanner.nextFloat();

            if(height >= MAX_HEIGHT || height < 0) {
                System.out.print("The height is incorrect. Please, enter the correct height: ");
            }
        } while(height >= MAX_HEIGHT || height < 0);

        isHeightValid = true;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public float getHeight() { return height; }

    public void info() {
        if(isValid())
            System.out.printf("Person:\nname: %s\nage: %d\nheight: %f", name, age, height);
        else
            System.out.println("Object has an incorrect value");
    }

    public boolean isValid() { return isAgeValid && isHeightValid && isNameValid; }
}
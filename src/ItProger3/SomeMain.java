package ItProger3;

public class SomeMain extends Main{
    int age;
    @Override
    protected void askAge() {
        System.out.println("Enter age: ");
        super.askAge();
    }
}

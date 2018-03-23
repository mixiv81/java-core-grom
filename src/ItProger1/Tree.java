package ItProger1;

public class Tree {
    public int age;
    public boolean isAlive;
    public String name;

    public  Tree(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(int age, boolean isAlive, String name){
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
    public Tree(){
    }

    public void outText(){
        System.out.println("The empty constructor without parameters has done");
    }
}

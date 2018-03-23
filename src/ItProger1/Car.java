package ItProger1;

public class Car {
    public int weight;
    public String model;
    public char color;
    public int speed;


    public void outAll(){
        System.out.println("Weight: " + weight + ", " + "model: " + model + ", color: "+ color + ", speed: " + speed);
    }
    public Car(int weight, String model, char color, int speed){
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public Car(){
    }

    public void inParametr(int weight, String model, char color, int speed){
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
}

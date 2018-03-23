package ItProger1;

public class Track extends Car{
    int numbersOfWheels;
    float maxWeight;

    public void newWheels(int newNumbersOfWheels){
        numbersOfWheels = newNumbersOfWheels;
        System.out.println(numbersOfWheels);
    }

    public Track(int weight, String model, char color, int speed, int numbersOfWheels, float maxWeight){
        super(weight, model,color,speed);
        this.numbersOfWheels = numbersOfWheels;
        this.maxWeight = maxWeight;
    }
}

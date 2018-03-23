package ItProger1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.weight = 1800;
        car.model = "zaz";
        car.color = 'R';
        car.speed = 120;

        car.outAll();

        Car car1 = new Car();
        car1.inParametr(1800, "zaz", 'R', 180);
        car1.outAll();

        Car car2 = new Car(1500, "sas", 'B', 130);

        car2.outAll();

        ClassOfHouses house = new ClassOfHouses();
        ClassOfHouses school = new ClassOfHouses();

        house.ClassOfHouses(11, 2015, "House");
        school.ClassOfHouses(5, 2010, "School");

        house.printAll();
        school.printAll();

        System.out.println(house.numbersYears(2018));

       /* Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number a1");
        int a1 = scr.nextInt();
        System.out.println( "Enter second number b1 ");
        int b1 = scr.nextInt();
        System.out.println("Enter third number c1 ");
        int c1 = scr.nextInt();

        System.out.println("Your result is " + function(a1,b1,c1));*/

       Tree tree = new Tree(10, "Oak");
       Tree tree1 = new Tree(20,true, "Pine");
       Tree tree2 = new Tree();
       tree2.outText();

       Track track = new Track(3000,"MAN",'G',110,8,2000f);

       track.newWheels(10);

        System.out.println(track.numbersOfWheels);
    }

    public static float function(float a, float b, float c) {
        if (b != 0 && c != 0)
            return a / b / c;
        else
            return 1;
    }
}

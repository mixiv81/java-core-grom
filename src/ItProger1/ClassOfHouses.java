package ItProger1;

public class ClassOfHouses {
    int numbersOfFloors;
    int yearOfCostruction;
    String names;



    public void ClassOfHouses(int numbersOfFloors, int yearOfConstruction, String names){
        this.numbersOfFloors = numbersOfFloors;
        this.yearOfCostruction = yearOfConstruction;
        this.names = names;
    }


    public void printAll() {
        System.out.println(numbersOfFloors +" " + yearOfCostruction +" "+ names);
    }
    public int numbersYears(int todayYear){

        if(yearOfCostruction < todayYear)
            return  todayYear - yearOfCostruction;
        else
            return 0;

    }

}

package Lesson8.Ads;


public class CarAd extends Ad {
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }

    void confirmAd(){
        //someLogic
    }
}

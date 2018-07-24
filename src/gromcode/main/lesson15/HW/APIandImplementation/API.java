package gromcode.main.lesson15.HW.APIandImplementation;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();

}

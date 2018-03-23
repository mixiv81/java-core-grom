package Lesson11.APIandImplementation;

public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countedArrInd = 0;
        for (Room room : rooms) {
            if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPersons() == persons && room.getPrice() == price) {
                    countedArrInd++;
                }
            }
        }

        Room[] roomsParam = new Room[countedArrInd];
        int index = 0;
        for (Room room : rooms) {
            if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPersons() == persons && room.getPrice() == price) {
                    roomsParam[index] = room;
                    index++;
                }
            }
        }
        return roomsParam;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}

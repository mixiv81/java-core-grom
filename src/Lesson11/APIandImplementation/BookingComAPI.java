package Lesson11.APIandImplementation;

public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countedArrInd = 0;
        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPrice() > price - 100 && room.getPrice() < price + 100) {
                    countedArrInd++;
                }
            }
        }

        Room[] roomsPrices = new Room[countedArrInd];
        int index = 0;
        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPrice() > price - 100 && room.getPrice() < price + 100) {
                    roomsPrices[index] = room;
                    index++;
                }
            }
        }
        return roomsPrices;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}

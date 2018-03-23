package Lesson11.APIandImplementation;

public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countedArrInd = 0;
        for (Room room : rooms) {
            if (room != null && room.getCityName().equals(city) && room.getHotelName().equals(hotel) && room.getPrice() == price) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    countedArrInd++;
                }
            }
        }
        Room[] roomsPrices = new Room[countedArrInd];
        int index = 0;
        for (Room room : rooms) {
            if (room.getCityName().equals(city) && room.getHotelName().equals(hotel) && room.getPrice() == price) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
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

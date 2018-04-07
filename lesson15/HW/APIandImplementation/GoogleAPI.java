package lesson15.HW.APIandImplementation;

public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }
        public GoogleAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room room1 = new Room(price, persons, city, hotel);
        int countedArrInd = 0;
        for (Room room : rooms) {
            if (room != null && room1.equals(room) && room1.hashCode() == room.hashCode()) {
                    countedArrInd++;
                }
            }

        Room[] roomsParam = new Room[countedArrInd];
        int index = 0;
        for (Room room : rooms) {
            if (room != null && room1.equals(room) && room1.hashCode() == room.hashCode()) {
                    roomsParam[index] = room;
                    index++;
                }
            }
        return roomsParam;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}

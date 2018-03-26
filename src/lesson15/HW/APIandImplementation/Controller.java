package lesson15.HW.APIandImplementation;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }
    
 public Controller() {
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int countInd = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    countInd++;
                }
            }
        }

        Room[] apisRes = new Room[countInd];
        int count = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    apisRes[count] = room;
                    count++;
                }
            }
        }
        return apisRes;
    }


    public Room[] check(API api1, API api2) {
        int countInd = 0;
        if (api1 != null && api2 != null)
        for (Room room1 : api1.getAll()){
            for (Room room2 : api2.getAll()) {
                if (room1 != null && room2 != null) {
                        if (room1.equals(room2) && room1.hashCode() == room2.hashCode()) {
                            countInd++;
                    }
                }
            }
        }

        Room[] resultRoom = new Room[countInd];
        int index = 0;
        if (api1 != null && api2 != null)
        for (Room room1 : api1.getAll()){
            for (Room room2 : api2.getAll()) {
                if (room1 != null && room2 != null) {
                    if (room1.equals(room2) && room1.hashCode() == room2.hashCode()) {
                            resultRoom[index] = room1;
                            index++;
                        }
                    }
                }
            }
        return resultRoom;
    }
}

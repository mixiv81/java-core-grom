package lesson15.HW.APIandImplementation;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(1581, 2000, 4, new Date(), "Dnepr", "Kiev");
        Room room2 = new Room(1582, 2800, 1, new Date(), "Hilton", "Kiev");
        Room room3 = new Room(1583, 2000, 4, new Date(), "Dnepr", "Kiev");
        Room room4 = new Room(1584, 2500, 3, new Date(), "Kiev", "Kiev");
        Room room5 = new Room(1585, 2800, 1, new Date(), "Hilton", "Kiev");
        Room room6 = new Room(1585, 2800, 1, new Date(), "Hilton", "Kiev");

        Room[] rooms = new Room[]{room1, room2};
        Room[] rooms1 = new Room[]{room3, room4};
        Room[] rooms2 = new Room[]{room5, room6};


        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms1);
        GoogleAPI googleAPI = new GoogleAPI(rooms2);
        API[] apis = new API[]{bookingComAPI, tripAdvisorAPI, googleAPI};
        Controller controller = new Controller(apis);

        System.out.println("Check");
        System.out.println(Arrays.toString(controller.check(bookingComAPI, googleAPI)));
        System.out.println(Arrays.toString(controller.check(bookingComAPI, tripAdvisorAPI)));
        System.out.println(Arrays.toString(controller.check(null, null)));
        System.out.println("RequestRooms");
        System.out.println(Arrays.toString(controller.requestRooms(2000, 4, "Dnepr", "Kiev")));
        System.out.println(Arrays.toString(controller.requestRooms(0, 0, null, null)));
        System.out.println(Arrays.toString(controller.requestRooms(2800, 1, "Hilton", "Kiev")));
        System.out.println("Mix");
        System.out.println(Arrays.toString(googleAPI.getAll()));
        System.out.println(Arrays.toString(bookingComAPI.findRooms(2800, 1, "Hilton", "Kiev")));

    }
}

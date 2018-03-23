package Lesson13.L11;

import Lesson11.APIandImplementation.*;

import java.util.Arrays;
import java.util.Date;

public class L11 {
    public static void main(String[] args) {
        Room room1 = new Room(1581, 1500, 4, new Date(), "Hilton", "Kiev");
        Room room2 = new Room(1582, 2500, 2, new Date(), "Hotel", "Kharkov");
        Room room3 = new Room(1583, 2000, 4, new Date(), "Dnepr", "Kiev");
        Room room4 = new Room(1584, 2500, 3, new Date(), "Kiev", "Kiev");
        Room room5 = new Room(1585, 2800, 1, new Date(), "Hilton", "Kiev");
        Room room6 = new Room(1585, 2800, 1, new Date(), "Hilton", "Kiev");
        Room[] rooms = new Room[]{room1, room2};
        Room[] rooms1 = new Room[]{room3, room4};
        Room[] rooms2 = new Room[]{room5, room6};
        BookingComAPI bookingComAPI = new BookingComAPI(rooms1);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms1);
        GoogleAPI googleAPI = new GoogleAPI(rooms2);
        API[] apis = new API[]{bookingComAPI, tripAdvisorAPI, googleAPI};
        Controller controller = new Controller(apis);



        System.out.println(Arrays.toString(controller.requestRooms(2000, 4, "Dnepr", "Kiev")));


        System.out.println(Arrays.toString(controller.requestRooms(2000, 4, "Dnepr", "Kiev")));
    }
}
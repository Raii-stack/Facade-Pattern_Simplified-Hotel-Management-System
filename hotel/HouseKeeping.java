package hotel;

public class HouseKeeping implements HotelService {
    @Override
    public void provideService() {
        System.out.println("Housekeeping service is available.");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service: Room " + roomNumber + " has been cleaned.");
    }
}
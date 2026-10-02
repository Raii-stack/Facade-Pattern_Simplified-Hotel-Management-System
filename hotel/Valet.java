package hotel;

public class Valet implements HotelService {
    @Override 
    public void provideService() {
        System.out.println("Valet service is available.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service: Vehicle " + plateNumber + " is ready for pick-up.");
    }
}

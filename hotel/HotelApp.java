package hotel;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.pickUpVehicle("ABC-123");
        frontDesk.cleanRoom(204);
        frontDesk.requestCart(2);
    }
}

package hotel;

public class Cart implements HotelService {
    @Override
    public void provideService() {
        System.out.println("Cart service is available.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service: " + numberOfCarts + " luggage cart(s) requested.");
    }
}
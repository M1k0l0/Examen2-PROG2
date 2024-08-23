
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Park extends Location{
    private List<Hotel> hotels;
    private static List<CustomerOpinion> customerParkOpinions = new ArrayList<CustomerOpinion>();

    public Park(String name, double latitude, double longitude, String description, List<CustomerOpinion> customerParkOpinions) {
        super(name, latitude, longitude, description);
        this.customerParkOpinions = customerParkOpinions;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public static List<CustomerOpinion> getCustomerParkOpinions() {
        return customerParkOpinions;
    }

    public void setCustomerParkOpinions(List<CustomerOpinion> customerParkOpinions) {
        this.customerParkOpinions = customerParkOpinions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return Objects.equals(hotels, park.hotels);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(hotels);
    }

    public void addHotel(Hotel hotel) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String hotelResult = decimalFormat.format(hotel.getLatitude());
        String hotelResult2 = decimalFormat.format(hotel.getLongitude());

        String parkResult = decimalFormat.format(this.getLatitude());
        String parkResult2 = decimalFormat.format(this.getLongitude());

        if(parkResult.equals(hotelResult) && parkResult2.equals(hotelResult2)) {
            this.hotels.add(hotel);
        }
    }

    public double findCheapestHotelPrice(List<Park> parks) {
        double cheapestPrice = 0;
        List<Hotel> cheapestHotels = new ArrayList();
        for (Park park : parks) {
            cheapestHotels += park.getRooms().getPrice();
            cheapestHotels.add(cheapestHotels);

            for(Hotel cheap : cheapestHotels){

            }
        }
    }
}

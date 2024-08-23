import java.util.ArrayList;
import java.util.List;

public class Hotel extends Location{
    private String phoneNumber;
    private String email;
    private static List<CustomerOpinion> customerHotelOpinions = new ArrayList<CustomerOpinion>();
    private List<Room> rooms = new ArrayList<>();

    public Hotel(String name, double latitude, double longitude, String description, String phoneNumber, String email, List<Room> rooms) {
        super(name, latitude, longitude, description);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rooms = rooms;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<CustomerOpinion> getCustomerHotelOpinions() {
        return customerHotelOpinions;
    }

    public void setCustomerHotelOpinions(List<CustomerOpinion> customerHotelOpinions) {
        this.customerHotelOpinions = customerHotelOpinions;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}

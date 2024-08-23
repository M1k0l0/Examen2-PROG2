import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomNumber;
    private double price;
    private static List<CustomerOpinion> customerRoomOpinions = new ArrayList<CustomerOpinion>();

    public Room(String roomNumber, double price, List<CustomerOpinion> customerRoomOpinions) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.customerRoomOpinions = customerRoomOpinions;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<CustomerOpinion> getCustomerRoomOpinions() {
        return customerRoomOpinions;
    }

    public void setCustomerRoomOpinions(List<CustomerOpinion> customerRoomOpinions) {
        this.customerRoomOpinions = customerRoomOpinions;
    }
}

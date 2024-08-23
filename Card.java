import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Card {
    private List<Park> parks;

    public Card(List<Park> parks) {
        this.parks = parks;
    }

    public List<Park> getParks() {
        return parks;
    }

    public void setParks(List<Park> parks) {
        this.parks = parks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(parks, card.parks);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(parks);
    }

    public List getAllReview() {
        List reviews = new ArrayList();

        for(Park park : parks) {
            if (parks.contains(Park.getCustomerParkOpinions())) {
                reviews.add(Park.getCustomerParkOpinions());
            } else if (park.getHotels().contains(Hotel.getCustomerHotelOpinions())) {
                reviews.add(Hotel.getCustomerHotelOpinions());
            } else {
                reviews.add(Room.getCustomerRoomOpinions());
            }
        }
        return reviews;
    }

    public Hotel findBestHotel(){
        for(Park p: parks){
            if()
        }
    }

    public List getAllPlacesInside(double latitudeMin, double latitudeMax, double longitudeMin, double longitudeMax) {
        List places = new ArrayList();

    }

    public List getAllReviewItems(){
        List reviews = new ArrayList();

        for (Park park : parks) {
            if(park.getHotels().contains(Park.getCustomerParkOpinions().get(hotels.getScore()))){
                reviews.add(Hotel.getCustomerHotelOpinions());
            }
            else if(park.getHotels().getRooms().contains(park.getCustomerParkOpinions().get(hotels.getScore) )){
                reviews.add(Room.getCustomerRoomOpinions());
            }
            else{
                reviews.add(Park.getCustomerParkOpinions());
            }
        }
        return reviews;
    }
}

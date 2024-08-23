import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerOpinion {
    private User user;
    private int score;
    private String description;
    private LocalDate reviewDate;


    public CustomerOpinion(User user, int score, String description, LocalDate reviewDate) {
        this.user = user;
        this.score = score;
        this.description = description;
        this.reviewDate = reviewDate;
    }

    public CustomerOpinion(User user, int score, String description) {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public void addReview(CustomerOpinion opinions){
        Hotel.getCustomerHotelOpinions().add(opinions);
    }

    public void addReview(User user, int score, String description, LocalDate reviewDate){
        Room.getCustomerRoomOpinions().add(new CustomerOpinion(user, score, description, reviewDate));
    }

    public void addReview(User user,int score,String description){
        Park.getCustomerParkOpinions().add(new CustomerOpinion(user, score, description));
    }

}

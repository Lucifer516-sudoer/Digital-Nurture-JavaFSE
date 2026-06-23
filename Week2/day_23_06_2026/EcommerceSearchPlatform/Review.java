package Week2.day_23_06_2026.EcommerceSearchPlatform;

import java.util.Date;

public class Review {
    // Maybe Here i can use Builder pattern
    // Why? to practice
    // But in my point of view, this is just a dataclass
    // On second thought, i will keep it like this itself,

    private final String userName;

    private final Date postedOn;
    private final String review;

    public Review(final String userName, final Date postedOn, final String review) {
        this.userName = userName;
        this.postedOn = postedOn;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review [userName=" + userName + ", postedOn=" + postedOn + ", review=" + review + "]";
    }

    public String getUserName() {
        return userName;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public String getReview() {
        return review;
    }

}

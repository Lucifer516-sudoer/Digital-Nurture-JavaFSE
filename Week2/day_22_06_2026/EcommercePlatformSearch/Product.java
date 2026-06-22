package Week2.day_22_06_2026.EcommercePlatformSearch;

import java.util.ArrayList;

public class Product {
    String name;
    float price;
    float discount;
    Rating rating;
    Category category;
    ArrayList<Review> reviews;

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", discount=" + discount + ", rating=" + rating
                + ", category=" + category + ", totalreviews=" + reviews.size() + "]";
    }

}

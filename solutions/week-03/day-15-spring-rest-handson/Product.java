package week02.day06.ecommerceplatformsearch;

import java.util.ArrayList;

public class Product {
    private final String name;
    float price;
    float discount;
    long stocksLeft;
    private final String seller;
    Rating rating;
    private final Category category;
    private ArrayList<Review> reviews;

    public Product(String name, float price, float discount, long stocksLeft, String seller, Rating rating,
            Category category) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stocksLeft = stocksLeft;
        this.seller = seller;
        this.rating = rating;
        this.category = category;
    }

    public String getIdentifier() {
        return this.name + this.seller;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", discount=" + discount + ", stocksLeft=" + stocksLeft
                + ", seller=" + seller + ", rating=" + rating + ", category=" + category + "]";
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(final float discount) {
        this.discount = discount;
    }

    public long getStocksLeft() {
        return stocksLeft;
    }

    public void setStocksLeft(final long stocksLeft) {
        this.stocksLeft = stocksLeft;
    }

    public String getSeller() {
        return seller;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(final Rating rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(final ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

}

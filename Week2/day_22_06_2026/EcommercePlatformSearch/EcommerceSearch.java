package Week2.day_22_06_2026.EcommercePlatformSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcommerceSearch {
    private Map<String, Product> products = new HashMap<>();
    private long totalProducts;

    public long getTotalProducts() {
        return totalProducts;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    //
    // CRUD Methods first
    //

    // Add new product
    public boolean addNewProduct(Product product) {
        // I know i can use SOLID principles in here
        Product res = products.putIfAbsent(product.getIdentifier(), product);
        return res == null;
    }

    // delete product
    public boolean deleteProduct(Product product) {
        // I could have only supplied seller ID, since this is new for me to program in
        // java i am not willing to take risks
        return products.remove(product.getIdentifier(), product);
    }

    // CD is enough I suppose

    /// Now for the filters and searchers
    public List<Product> searchByName(String name) {
        // Should i return a List or array?
        List<Product> result = new ArrayList<>();
        // I could have returned an HashMap though, but its ok
        for (Product each : this.products.values())
            if (each.getName() == name)
                result.add(each);
        return result;

    }

    public List<Product> searchByCategory(Category category) {
        List<Product> result = new ArrayList<>();

        for (Product each : this.products.values())
            if (each.getCategory() == category)
                result.add(each);
        return result;

    }

    public List<Product> filterByPrice(float startRange, float stopRange) {
        List<Product> result = new ArrayList<>();
        for (Product each : this.products.values())
            if (each.getPrice() > startRange && each.getPrice() < stopRange)
                result.add(each);
        return result;

    }

    public List<Product> filterByDiscount(float discountPercentage) {
        List<Product> result = new ArrayList<>();
        for (Product each : this.products.values())
            if (each.getDiscount() > discountPercentage)
                result.add(each);
        return result;

    }

    public List<Product> filterByRatings(Rating rating) {
        List<Product> result = new ArrayList<>();
        for (Product each : this.products.values())
            if (each.getRating() == rating)
                result.add(each);

        // The way I have done this in here is wrong
        return result;

    }

    public void printProducts() {
        this.products
                .forEach(
                        (key, value) -> System.out.println("[" + key + "]: " + value + "\n--------------------------"));
    }

    public void printProducts(List<Product> products) {
        for (Product each : products)
            System.out.println(
                    "[ "
                            + each.getIdentifier()
                            + " ] => " + each.toString());
    }

}

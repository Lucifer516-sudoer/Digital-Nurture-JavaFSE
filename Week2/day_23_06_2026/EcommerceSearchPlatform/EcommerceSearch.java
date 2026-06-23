// Exercise 2: E-commerce Platform Search Function
// Scenario:
//  - You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.
// Steps:
// Understand Asymptotic Notation:
//  - Explain Big O notation and how it helps in analyzing algorithms.
//  - Describe the best, average, and worst-case scenarios for search operations.
// Setup:
//  - Create a class Product with attributes for searching, such as productId, productName, and category.
// Implementation:
//  - Implement linear search and binary search algorithms.
//  - Store products in an array for linear search and a sorted array for binary search.
// Analysis:
//  - Compare the time complexity of linear and binary search algorithms.
//  - Discuss which algorithm is more suitable for your platform and why
package Week2.day_23_06_2026.EcommerceSearchPlatform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
            if (each.getName().equalsIgnoreCase(name))
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

    // NOTE: Going to implement the search operation(s) using for loop when needed
    public Product searchProductByID(long productID) {
        // QUESTION: How can I actually convert this and is this correct?
        Product[] productsArr = this.products.values().toArray(new Product[this.products.size()]);

        Arrays.sort(productsArr, Comparator.comparingLong(Product::getProductID)); // HACK: Didn't worry about the
                                                                                   // sorting, so used built-in one.

        int left = 0, right = productsArr.length - 1;
        // HACK: There was some issue with the long and int, being used as the index, so
        // i stopped it and used `int`
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Note: Best case
            if (productsArr[mid].getProductID() == productID) {
                return productsArr[mid];
            } else {
                if (productsArr[mid].getProductID() > productID) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return null; // NOTE: Worst Case Scenario I suppose.

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
                            + each.getProductID()
                            + " ] => " + each.toString());
    }

}

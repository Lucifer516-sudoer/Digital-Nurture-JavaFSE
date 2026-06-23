package Week2.day_23_06_2026.EcommerceSearchPlatform;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Going to use dummy prods
        Product[] prods = {

                new Product(
                        "iPhone 15",
                        69999,
                        10,
                        25,
                        "Apple Store",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        "iPhone 15",
                        68499,
                        12,
                        18,
                        "Reliance Digital",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        "Samsung Galaxy S24",
                        62999,
                        15,
                        30,
                        "Samsung India",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        "Boat Airdopes 311",
                        1499,
                        45,
                        250,
                        "Boat Lifestyle",
                        Rating.STAR_4,
                        Category.ELECTRONICS),
                new Product(
                        "Sony WH-1000XM5",
                        24999,
                        20,
                        14,
                        "Sony",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        "Puma Running Shoes",
                        3299,
                        35,
                        72,
                        "Puma",
                        Rating.STAR_4,
                        Category.FASHION),
                new Product(
                        "Levi's Slim Fit Jeans",
                        2299,
                        40,
                        95,
                        "Levi's",
                        Rating.STAR_4,
                        Category.FASHION),
                new Product(
                        "Prestige Pressure Cooker",
                        1899,
                        30,
                        120,
                        "Prestige",
                        Rating.STAR_5,
                        Category.HOME_AND_KITCHEN),
                new Product(
                        "Milton Water Bottle",
                        499,
                        18,
                        500,
                        "Milton",
                        Rating.STAR_4,
                        Category.HOME_AND_KITCHEN),
                new Product(
                        "Mamaearth Face Wash",
                        299,
                        22,
                        340,
                        "Mamaearth",
                        Rating.STAR_4,
                        Category.BEAUTY_AND_PERSONAL_CARE),
                new Product(
                        "Dove Shampoo",
                        449,
                        15,
                        200,
                        "Hindustan Unilever",
                        Rating.STAR_5,
                        Category.BEAUTY_AND_PERSONAL_CARE),
                new Product(
                        "Aashirvaad Atta 10kg",
                        529,
                        8,
                        150,
                        "ITC",
                        Rating.STAR_5,
                        Category.GROCERY),
                new Product(
                        "Tata Salt 1kg",
                        30,
                        5,
                        800,
                        "Tata Consumer",
                        Rating.STAR_5,
                        Category.GROCERY),
                new Product(
                        "Amul Butter 500g",
                        285,
                        12,
                        90,
                        "Amul",
                        Rating.STAR_4,
                        Category.GROCERY),
                new Product(
                        "Chetak",
                        1900,
                        35,
                        6023,
                        "Hindisthan Enterprises",
                        Rating.STAR_4,
                        Category.ELECTRONICS)
        };

        EcommerceSearch searcher = new EcommerceSearch();
        for (Product each : prods) {
            searcher.addNewProduct(each);

        }
        System.out.println("======================================");
        System.out.println("All Products");
        System.out.println("======================================");
        searcher.printProducts(); // See too many responsibilities
        System.out.println("Searching by Category ...");
        List<Product> res = searcher.filterByPrice(200, 500);
        searcher.printProducts(res);
    }
}

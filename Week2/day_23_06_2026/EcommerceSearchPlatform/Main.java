package Week2.day_23_06_2026.EcommerceSearchPlatform;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Going to use dummy prods
        Product[] prods = {

                new Product(
                        1,
                        "iPhone 15",
                        69999,
                        10,
                        25,
                        "Apple Store",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        2,
                        "iPhone 15",
                        68499,
                        12,
                        18,
                        "Reliance Digital",
                        Rating.STAR_5,
                        Category.ELECTRONICS),
                new Product(
                        3,
                        "Samsung Galaxy S24",
                        62999,
                        15,
                        30,
                        "Samsung India",
                        Rating.STAR_5,
                        Category.ELECTRONICS),

                new Product(
                        4,
                        "Boat Airdopes 311",
                        1499,
                        45,
                        250,
                        "Boat Lifestyle",
                        Rating.STAR_4,
                        Category.ELECTRONICS),

                new Product(
                        5,
                        "Sony WH-1000XM5",
                        24999,
                        20,
                        14,
                        "Sony",
                        Rating.STAR_5,
                        Category.ELECTRONICS),

                new Product(
                        6,
                        "Puma Running Shoes",
                        3299,
                        35,
                        72,
                        "Puma",
                        Rating.STAR_4,
                        Category.FASHION),

                new Product(
                        7,
                        "Levi's Slim Fit Jeans",
                        2299,
                        40,
                        95,
                        "Levi's",
                        Rating.STAR_4,
                        Category.FASHION),

                new Product(
                        8,
                        "Prestige Pressure Cooker",
                        1899,
                        30,
                        120,
                        "Prestige",
                        Rating.STAR_5,
                        Category.HOME_AND_KITCHEN),

                new Product(
                        9,
                        "Milton Water Bottle",
                        499,
                        18,
                        500,
                        "Milton",
                        Rating.STAR_4,
                        Category.HOME_AND_KITCHEN),

                new Product(
                        10,
                        "Mamaearth Face Wash",
                        299,
                        22,
                        340,
                        "Mamaearth",
                        Rating.STAR_4,
                        Category.BEAUTY_AND_PERSONAL_CARE),

                new Product(
                        11,
                        "Dove Shampoo",
                        449,
                        15,
                        200,
                        "Hindustan Unilever",
                        Rating.STAR_5,
                        Category.BEAUTY_AND_PERSONAL_CARE),

                new Product(
                        12,
                        "Aashirvaad Atta 10kg",
                        529,
                        8,
                        150,
                        "ITC",
                        Rating.STAR_5,
                        Category.GROCERY),

                new Product(
                        13,
                        "Tata Salt 1kg",
                        30,
                        5,
                        800,
                        "Tata Consumer",
                        Rating.STAR_5,
                        Category.GROCERY),

                new Product(
                        14,
                        "Amul Butter 500g",
                        285,
                        12,
                        90,
                        "Amul",
                        Rating.STAR_4,
                        Category.GROCERY),

                new Product(
                        15,
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
        System.out.println(searcher.searchProductByID(15).toString());
    }
}

package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ProductCategory {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Silver", 999.99));
        products.add(new Product("Phone", "Black", 699.99));
        products.add(new Product("Tablet", "White", 299.99));
        products.add(new Product("Smartwatch", "Black", 199.99));

        System.out.println("All Products:");
        products.forEach(System.out::println);

        String specifiedColor = "Black";
        List<Product> blackProducts = products.stream()
                .filter(product -> product.getColor().equalsIgnoreCase(specifiedColor))
                .collect(Collectors.toList());

        System.out.println("\nProducts with Color '" + specifiedColor + "':");
        blackProducts.forEach(System.out::println);

        double specifiedPrice = 500.0;
        List<Product> affordableProducts = products.stream()
                .filter(product -> product.getPrice() >= specifiedPrice)
                .collect(Collectors.toList());

        System.out.println("\nProducts with Price more than or equal to $" + specifiedPrice + ":");
        affordableProducts.forEach(System.out::println);
    }
}


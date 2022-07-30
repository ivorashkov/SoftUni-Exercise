package AdvancedJava.Advanced.SetsAndMaps;

import java.util.*;

public class ProductShop {

    static class Product {
        String name;
        Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<Product>> shopsMap = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] info = input.split(", ");
            String store = info[0];
            String prodName = info[1];
            double price = Double.parseDouble(info[2]);

            Set<Product> products = shopsMap.get(store);

            if (products != null) {
                products.add(new Product(prodName, price));
            } else {
                //Product product = new Product(prodName, price);
                Set<Product> productsListSet = new LinkedHashSet<>();
                productsListSet.add(new Product(prodName,price));
                shopsMap.put(store, productsListSet);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<Product>>entry: shopsMap.entrySet()) {
            Set<Product> products = entry.getValue();
            String shopName = entry.getKey();

            System.out.printf("%s->%n",shopName);
            for (Product p:products) {
                System.out.printf("Product: %s, Price: %.1f%n",p.getName(),p.getPrice());
            }

        }

    }
}

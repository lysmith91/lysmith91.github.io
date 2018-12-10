package com.cs360.lydiasmith.localcoffeeshop.data;


import com.cs360.lydiasmith.localcoffeeshop.R;
import com.cs360.lydiasmith.localcoffeeshop.models.Product;

import java.util.ArrayList;
import java.util.List;


//Product data that will be entered into database for menu.
public class ProductData {
    public static List<Product> getSampleProducts(){
        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setProductName("Coffee");
        product1.setCategoryName("Hot");
        product1.setDescription("Freshly Roasted Beans From Local Beans");
        product1.setImagePath("");
        product1.setSalePrice(1.00);
        products.add(product1);

        Product product2 = new Product();
        product2.setProductName("Cafe Latte");
        product2.setCategoryName("Hot");
        product2.setDescription("Espresso with steamed milk, topped with short head of froth");
        product2.setImagePath("");
        product2.setSalePrice(1.01);
        products.add(product2);

        Product product3 = new Product();
        product3.setProductName("Cappaccino");
        product3.setCategoryName("Hot");
        product3.setDescription("One-third espresso, one-third milk, and about one-third rather stiff foam");
        product3.setImagePath("");
        product3.setSalePrice(1.02);
        products.add(product3);

        Product product4 = new Product();
        product4.setProductName("Espresso");
        product4.setCategoryName("Hot");
        product4.setDescription("Double shot, fresh beans!");
        product4.setImagePath("");
        product4.setSalePrice(1.03);
        products.add(product4);

        Product product5 = new Product();
        product5.setProductName("Macchiato");
        product5.setCategoryName("Hot");
        product5.setDescription("Prepared with espresso and little bit of steamed milk");
        product5.setImagePath("");
        product5.setSalePrice(1.04);
        products.add(product5);

        Product product6 = new Product();
        product6.setProductName("Americano");
        product6.setCategoryName("Hot");
        product6.setDescription("Espresso and hot water");
        product6.setImagePath("");
        product6.setSalePrice(1.05);
        products.add(product6);

        Product product7 = new Product();
        product7.setProductName("Mocha");
        product7.setCategoryName("Hot");
        product7.setDescription("Double espresso shot, chocolate syrup, steamed milk and whipped cream");
        product7.setImagePath("");
        product7.setSalePrice(1.06);
        products.add(product7);

        Product product8 = new Product();
        product8.setProductName("Iced Coffee");
        product8.setCategoryName("Cold");
        product8.setDescription("Our signature coffee served with ice!");
        product8.setImagePath("");
        product8.setSalePrice(1.07);
        products.add(product8);

        Product product9 = new Product();
        product9.setProductName("Iced Americano");
        product9.setCategoryName("Cold");
        product9.setDescription("Refreshing Americano served with ice!");
        product9.setImagePath("");
        product9.setSalePrice(1.08);
        products.add(product9);

        Product product10 = new Product();
        product10.setProductName("Iced Latte");
        product10.setCategoryName("Cold");
        product10.setDescription("Our latte served cold, made to order.");
        product10.setImagePath("");
        product10.setSalePrice(1.09);
        products.add(product10);

        Product product11 = new Product();
        product11.setProductName("Green Tea");
        product11.setCategoryName("Hot Tea");
        product11.setDescription("Robust, healthy tea, alternative caffeine source");
        product11.setImagePath("");
        product11.setSalePrice(1.10);
        products.add(product11);

        Product product12 = new Product();
        product12.setProductName("Black Tea");
        product12.setCategoryName("Hot Tea");
        product12.setDescription("Brewed to your tastes!");
        product12.setImagePath("");
        product12.setSalePrice(1.11);
        products.add(product12);

        return products;
    }
}

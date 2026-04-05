import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {
}

public class Store {

    /* Abstract Class Challenge:
    In this challenge, you need to build an application that can be a storefront for any imaginable item for sale.
    Instead of the Main class we usually create, create a Store class with a main method.
    The Store class should:
        - manage a list of products for sale, including displaying the product details.
        - manage an order, which can just be a list of OrderItem objects.
        - have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.

    Also create a ProductForSale class that should have at least three fields: a type, price, and a description. This class should also have methods to:
        - getSalesPrice, a concrete method, which takes a quantity, and returns the quantity times the price.
        - printPricedItem, a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and line-item price.
        - showDetails, an abstract method, which represents what might be displayed on a product page. Product type, description, price, and so on.
    Also create an OrderItem type, that has at a minimum 2 fields, quantity and a Product for Sale.
    You should also create two or three classes that extend the ProductForSale class, that will be products in your store.
    */

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));

        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        listProducts();
        /* OUTPUT:
            ------------------------------
            This Oil Painting is a beautiful reproduction
            The price of the piece is $1350,00
            Impressionistic work by ABF painted in 2010
            ------------------------------
            This Sculpture is a beautiful reproduction
            The price of the piece is $2000,00
            Bronze work by JKF, produced in 1950
            ------------------------------
            This Desk was manufactured in North Carolina
            The price of the piece is $500,00
            Mahogany Desk
            ------------------------------
            This Lamp was manufactured in North Carolina
            The price of the piece is $200,00
            Tiffany Lamp with Hummingbirds
        */


        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        /* OUTPUT:
            Order 1
                2 qty at $ 2000,00 each,  Sculpture       Bronze work by JKF, produced in 1950
                1 qty at $ 1350,00 each,  Oil Painting    Impressionistic work by ABF painted in 2010
            Sales Total = $5350,00
        */

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);

        /* OUTPUT:
            Order 2
                5 qty at $  200,00 each,  Lamp            Tiffany Lamp with Hummingbirds
                1 qty at $ 1350,00 each,  Oil Painting    Impressionistic work by ABF painted in 2010
                1 qty at $  500,00 each,  Desk            Mahogany Desk
            Sales Total = $2850,00
        */
    }

    private static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    private static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    private static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }

        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
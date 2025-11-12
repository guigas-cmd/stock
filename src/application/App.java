package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product Product;
        Product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        Product.name = sc.next();

        System.out.println("Price: ");
        Product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        Product.quantity = sc.nextInt();

        // PRODUCT DATA
        System.out.printf("Product data: %s, $ %.2f, %d units, $ %.2f Total: \n",
                Product.name, Product.price, Product.quantity, Product.getTotal());

        System.out.println("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        Product.addProducts(add); // chama metodo 2

        // UPDATE DATA
        System.out.printf("Uptdated data: %s %.2f %d $ %.2f Total:",
                Product.name, Product.price, Product.quantity, Product.getTotal());

        System.out.println("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        Product.removeProducts(remove);

        // UPDATE DATA
        System.out.printf("Uptdated data: %s %.2f %d $ %.2f Total:",
                Product.name, Product.price, Product.quantity, Product.getTotal());

        sc.close();
    }
}

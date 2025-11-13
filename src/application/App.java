package application;
import entities.ProductClass;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductClass product = new ProductClass();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // PRODUCT DATA
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);

        // UPDATE DATA
        System.out.println(product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);

        // UPDATE DATA
        System.out.println(product);

        sc.close();
    }
}

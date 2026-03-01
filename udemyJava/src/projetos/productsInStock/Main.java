package projetos.productsInStock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Products product = new Products();

        System.out.println("Enter products data:");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: $");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        product.status();

        System.out.print("add more products to stock: ");
        product.addProducts(sc.nextInt());

        product.status();

        System.out.print("remove products from stock: ");
        product.removeProducts(sc.nextInt());

        product.status();

        sc.close();
    }
}

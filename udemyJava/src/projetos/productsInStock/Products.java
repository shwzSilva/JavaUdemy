package projetos.productsInStock;

public class Products {
    private String name;
    private double price;
    private int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public void status(){
        System.out.println("Name: " + this.name + ", Price: " + this.price + ", Quantity in stock: " + this.quantity + ", ValueTotal $" + this.totalValueInStock());
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

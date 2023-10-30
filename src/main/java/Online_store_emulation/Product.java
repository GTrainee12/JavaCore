package Online_store_emulation;


import lombok.Getter;


@Getter

public class Product {
    private final String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }
}

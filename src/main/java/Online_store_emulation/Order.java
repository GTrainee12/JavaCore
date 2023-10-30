package Online_store_emulation;


import lombok.Getter;

@Getter
public class Order {
    private final Customer customer;
    private final Product product;
    private final int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}
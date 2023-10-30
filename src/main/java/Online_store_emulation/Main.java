package Online_store_emulation;

public class Main {
    private static Customer[] customers;
    private static Product[] products;
    private static Order[] orders;
    private static int totalPurchases;

    public static void main(String[] args) {
        customers = new Customer[3];
        customers[0] = new Customer("John", 1);
        customers[1] = new Customer("Mary", 2);
        customers[2] = new Customer("Alex", 3);

        products = new Product[3];
        products[0] = new Product("Apple", 10);
        products[1] = new Product("Orange", 5);
        products[2] = new Product("Banana", 3);

        orders = new Order[5];
        totalPurchases = 0;

        try {
            Order order1 = makePurchase("John", "Apple", 2);
            addOrder(order1);
            System.out.println("Покупка успешно совершена!");

            Order order2 = makePurchase("Mary", "Orange", 6); // NegativeQuantityException("Недостаточно товара");
            addOrder(order2);
            System.out.println("Покупка успешно совершена!");

            Order order3 = makePurchase("Alex", "Banana", -1); //NegativeQuantityException("Количество не может быть отрицательным");
            addOrder(order3);
            System.out.println("Покупка успешно совершена!");
        } catch (NonexistentCustomerException | NonexistentProductException | NegativeQuantityException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Итоговое количество совершенных покупок: " + totalPurchases);
    }

    public static Order makePurchase(String customerName, String productName, int quantity)
            throws NonexistentCustomerException, NonexistentProductException, NegativeQuantityException {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            throw new NonexistentCustomerException("Покупатель с именем " + customerName + " не существует");
        }

        Product product = findProduct(productName);
        if (product == null) {
            throw new NonexistentProductException("Товар с названием " + productName + " не существует");
        }

        if (quantity < 0) {
            throw new NegativeQuantityException("Количество не может быть отрицательным");
        }

        if (quantity > product.getQuantity()) {
            throw new NegativeQuantityException("Недостаточно товара");
        }

        product.decreaseQuantity(quantity);
        totalPurchases++;
        return new Order(customer, product, quantity);
    }

    public static void addOrder(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                break;
            }
        }
    }

    public static Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public static Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}

class NonexistentCustomerException extends Exception {
    public NonexistentCustomerException(String message) {
        super(message);
    }
}

class NonexistentProductException extends Exception {
    public NonexistentProductException(String message) {
        super(message);
    }
}

class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message) {
        super(message);
    }
}

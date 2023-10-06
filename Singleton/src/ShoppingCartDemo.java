public class ShoppingCartDemo {
    public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    Product product1 = new Product("Item 1", 20.0, 2);
    Product product2 = new Product("Item 2", 30.0, 1);

    cart.addProduct(product1);
    cart.addProduct(product2);

    System.out.println("Total amount in the cart: " + cart.calculateTotal() + " USD");

    // Choose a payment strategy
    PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
    PaymentStrategy payPalPayment = new PayPalPayment("example@email.com");

    // Complete the checkout using the selected payment strategy
    cart.checkout(creditCardPayment);
    cart.checkout(payPalPayment);
}
}

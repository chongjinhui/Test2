public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        Product apple = new Product("Apple", 1.0); //David
        Product banana = new Product("Banana", 0.5);

        cart.addProduct(apple, 3);
        cart.addProduct(banana, 2);

        System.out.println("Total before removal: " + cart.calculateTotal());

        cart.removeProduct(apple);
        
        System.out.println("Total after removal: " + cart.calculateTotal());
    }
}

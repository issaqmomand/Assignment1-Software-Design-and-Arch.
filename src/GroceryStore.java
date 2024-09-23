public class GroceryStore {
    public static void main(String[] args) {
        GroceryProductFactory bananaFactory = new BananaFactory();
        Product banana = bananaFactory.createProduct();
        bananaFactory.setPrice(banana);
        System.out.println("Banana price: " + banana.getPrice());

        GroceryProductFactory appleFactory = new AppleFactory();
        Product apple = appleFactory.createProduct();
        appleFactory.setPrice(apple);
        System.out.println("Apple price: " + apple.getPrice());
    }
}

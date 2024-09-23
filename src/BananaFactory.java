import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BananaFactory implements GroceryProductFactory {
    @Override
    public Product createProduct() {
        return new Banana();
    }

    @Override
    public void setPrice(Product product) {
        try (BufferedReader reader = new BufferedReader(new FileReader("product_prices.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase("banana")) {
                    product.setPrice(Double.parseDouble(parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartImplementation implements ShoppingCartOperation {

    private Map<String, Integer> products = new HashMap<>(); // Produkt - liczba

    @Override
    public boolean addProduct(String productName, double price, int quantity) {
        if (products.containsKey(productName)) {
            int currentQuantity = products.get(productName);
            products.put(productName, currentQuantity + quantity);
        } else {
            products.put(productName, quantity);
        }
        return true;
    }

    @Override
    public boolean removeProduct(String productName) {
        if (products.containsKey(productName)) {
            products.remove(productName);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateQuantity(String productName, int newQuantity) {
        if (products.containsKey(productName)) {
            products.put(productName, newQuantity);
            return true;
        }
        return false;
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int countProducts() {
        return products.size();
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            // add logic
        }
        return totalPrice;
    }

    @Override
    public boolean applyDiscountCode(String discountCode) {
        // add logic
        return true; // yea
    }

    @Override
    public boolean checkout() {
        // add logic
        return true; // yea
    }
}

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class ShoppingCartTest {

    private ShoppingCartOperation shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCartImplementation(); // Załóżmy, że ShoppingCartImplementation implementuje interfejs ShoppingCartOperation
    }

    @Test
    public void testAddProduct() {
        assertTrue(shoppingCart.addProduct("Product 1", 10, 2));
        assertEquals(1, shoppingCart.countProducts());
    }

    @Test
    public void testRemoveProduct() {
        shoppingCart.addProduct("Product 1", 10, 2);
        assertTrue(shoppingCart.removeProduct("Product 1"));
        assertEquals(0, shoppingCart.countProducts());
    }

    @Test
    public void testUpdateQuantity() {
        shoppingCart.addProduct("Product 1", 10, 2);
        assertTrue(shoppingCart.updateQuantity("Product 1", 5));
        assertEquals(5, shoppingCart.countProducts());
    }

    @Test
    public void testGetProducts() {
        shoppingCart.addProduct("Product 1", 10, 2);
        shoppingCart.addProduct("Product 2", 20, 1);
        List<String> products = shoppingCart.getProducts();
        assertEquals(2, products.size());
        assertTrue(products.contains("Product 1"));
        assertTrue(products.contains("Product 2"));
    }

    @Test
    public void testCountProducts() {
        shoppingCart.addProduct("Product 1", 10, 2);
        assertEquals(2, shoppingCart.countProducts());
    }

    @Test
    public void testGetTotalPrice() {
        shoppingCart.addProduct("Product 1", 10, 2);
        shoppingCart.addProduct("Product 2", 20, 1);
        assertEquals(40, shoppingCart.getTotalPrice());
    }

    @Test
    public void testApplyDiscountCode() {
        assertTrue(shoppingCart.applyDiscountCode("DISCOUNT"));
    }

    @Test
    public void testCheckout() {
        assertTrue(shoppingCart.checkout());
    }
}

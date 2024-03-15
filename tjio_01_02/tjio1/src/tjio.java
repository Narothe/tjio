import java.util.List;

class UnitTests {
    public static void main(String[] args) {
        new TablesTests().tablesNull();
        new TablesTests().tablesEmpty();
        new TablesTests().tablesOneDigit();
        new TablesTests().tablesMaxDigit();

        System.out.println("All lab1 tests completed successfully!");

        new PrimeNumberTests().primeNull();
        new PrimeNumberTests().primeNegative();
        new PrimeNumberTests().primeZero();
        new PrimeNumberTests().primePositive();
        new PrimeNumberTests().primePositivePrime(2);
        new PrimeNumberTests().primePositivePrime(13);
        new PrimeNumberTests().primePositivePrime(97);

        // Tworzymy obiekt klasy ShoppingCartImplementation
        ShoppingCartOperation shoppingCart = new ShoppingCartImplementation();

        // Dodajemy produkt do koszyka
        shoppingCart.addProduct("Laptop", 1500.0, 1);
        shoppingCart.addProduct("Smartphone", 800.0, 2);

        // Pobieramy listę produktów
        List<String> products = shoppingCart.getProducts();
        System.out.println("Produkty w koszyku: " + products);

        // Aktualizujemy ilość produktu
        shoppingCart.updateQuantity("Laptop", 2);

        // Usuwamy produkt z koszyka
        shoppingCart.removeProduct("Smartphone");

        // Pobieramy sumę cen produktów w koszyku
        double totalPrice = shoppingCart.getTotalPrice();
        System.out.println("Suma cen produktów w koszyku: " + totalPrice);

        // Pobieramy liczbę produktów w koszyku
        int count = shoppingCart.countProducts();
        System.out.println("Liczba produktów w koszyku: " + count);

        // Zastosowanie kuponu rabatowego
        shoppingCart.applyDiscountCode("DISCOUNT123");

        // Realizacja zamówienia
        boolean checkoutSuccess = shoppingCart.checkout();
        if (checkoutSuccess) {
            System.out.println("Zamówienie zostało zrealizowane.");
        } else {
            System.out.println("Wystąpił problem podczas realizacji zamówienia.");
        }

        System.out.println("All lab2 tests completed successfully!");
    }
}

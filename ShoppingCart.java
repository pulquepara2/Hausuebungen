public class ShoppingCart {
    public static void main(String[] args) {
        String[] itemsInCart = {"granola", "cucumber", "butter"};
        double[] prices = {5.5, 3, 4};

        for (int i = 0; i < itemsInCart.length; i++) {
            System.out.println(itemsInCart[i] + " costs " + prices[i]);
        }
    }
}

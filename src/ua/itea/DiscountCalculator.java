package ua.itea;

public class DiscountCalculator {

    public static void main(String[] args) {

        double pure_amount = 475.0;

        if (pure_amount <= 0){
            System.out.println("You have no money");
            return;
        }

        short discount_percent = 0;

        if (pure_amount >= 1 && pure_amount < 300) {
            discount_percent = 0;
        } else if (pure_amount >= 300 && pure_amount < 400) {
            discount_percent = 3;
        } else if (pure_amount >= 400 && pure_amount < 500) {
            discount_percent = 5;
        } else if (pure_amount >= 500) {
            discount_percent = 7;
        }

        double discounted_amount = pure_amount - ((pure_amount / 100) * discount_percent);

        String message = String.format("Your discount is %d%%, total to pay: %.2f", discount_percent, discounted_amount);

        System.out.println(message);
    }
}

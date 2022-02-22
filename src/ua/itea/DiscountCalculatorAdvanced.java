package ua.itea;

public class DiscountCalculatorAdvanced {

    public static void main(String[] args) {

        int pure_amount = 475;

        short discount_percent = switch (pure_amount / 100) {
            case 0, 1, 2 -> 0;
            case 3 -> 3;
            case 4 -> 5;
            case 5 -> 7;
            default -> 0;
        };

        double discounted_amount = pure_amount - ((float)(pure_amount * discount_percent) / 100);

        String message = String.format("Your discount is %d%%, total to pay: %.2f", discount_percent, discounted_amount);

        System.out.println(message);
    }
}

package ua.itea;

public class NumberProcessor {
    public static void main (String[] args) {
        int number = 24279766;

        short counter = 0;
        short even_summ = 0;
        for (int i = number; i >= 1; i/=10) {
            int last_digit = i % 10;
            System.out.println(last_digit);
            if (last_digit % 2 == 0) {
                even_summ += last_digit;
            }
            counter++;
        }

        System.out.println("Digits in number: " + counter + "\n");
        System.out.println("Summary of even digits in number: " + even_summ);
    }
}

1. Реализовать сортировку массива [100][100]
2. Прогулка собаки [10][10] bomb & aid on each row. Game over - bottom rigth corner
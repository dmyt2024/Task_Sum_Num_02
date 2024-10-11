package app;

import java.util.Random;

public class Sum_num_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100_000) + 11;
        System.out.println("Рандомне число: " + num);

        int num_len = String.valueOf(Math.abs(num)).length();
        int sum = 0;

        for (int i = 0; i < num_len; i++) {
            int nums = num % 10;
            num /= 10;
            sum += nums;
            System.out.println(num);


        }

        System.out.println("Сума числа: " + sum);
    }
}

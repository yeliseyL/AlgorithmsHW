package HW5;

public class Main {
    public static void main(String[] args) {
        System.out.println(recPower(2, 3));

        int[] values = new int[] {94, 260, 992, 281, 127};
        int[] weights = new int[] {4, 9, 4, 21, 0};
        int W = 30;

        System.out.println(knapsackRec(weights, values, values.length, W));
    }

    static int knapsackRec(int[] weights, int[] values, int n, int W) {
        if (n <= 0) {
            return 0;
        } else if (weights[n - 1] > W) {
            return knapsackRec(weights, values, n - 1, W);
        } else {
            return Math.max(knapsackRec(weights, values, n - 1, W), values[n - 1]
                    + knapsackRec(weights, values, n - 1, W - weights[n - 1]));
        }
    }

    public static int recPower(int number, int n) {
        if (n == 0) {
            return 1;
        }

        if (number == 0) {
            return 0;
        }

        if (n == 1) {
            return number;
        }

        return recPower(number, n - 1) * number;
    }
}

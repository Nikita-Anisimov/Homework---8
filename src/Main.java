import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int[] inputArray1 = {15, 25, 10, 44, 50};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        float middle = sum / inputArray1.length;
        System.out.println(Arrays.toString(inputArray1));
        float[] outputArray1 = {sum, max, min, middle};
        for (int i = 0; i < inputArray1.length; i++) {
        }
        for (int i : inputArray1) {
            sum += i;
        }
        for (int i : inputArray1) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : inputArray1) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("outputArray1: " + sum + ", " + max + ", " + min + ", " + middle);

        System.out.println("Задача 2:");
        int[] inputArray2 = {1500, 25000, 10000, 44000, 50000};
        int element = 0;
        float[] outputArray2 = new float[5];
        for (float pay : inputArray2) {
            float tax = pay * 0.13f;
            outputArray2[element] = tax;
            element++;
            System.out.println(tax);
        }

        System.out.println("Задача 3:");
        int[] inputArray3 = {1500, 25000, 10000, 44000, 50000};
        int index = 0;
        boolean[] outputArray3 = new boolean[5];
        for (int prize : inputArray3) {
            if (prize > 5000) {
                outputArray3[index] = true;
            } else {
                outputArray3[index] = false;
            }
            index++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задача 4:");
        int[] inputArray4 = {1500, -25000, 10000, 44000, -50000};
        boolean outputFlag = true;

        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {
                outputFlag = false;
                break;
            }
        }

        System.out.println(outputFlag);

    }
}



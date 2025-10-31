import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int[] number = new int[5];
        number[0] = 10;
        number[3] = 20;

        float[] ball = {1.57f, 7.654f, 9.986f};
        int [] two = new  int [3];
        ball[0] = 90;
        ball[1] = 55;
        ball[2] = 70;

        System.out.println("Задача 2:");
        for (int i = 0; i < number.length; i++) {
            if (i > 0) {
                System.out.print(number[i]+", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3:");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4:");
        int num [] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i <num.length; i++ ) {
            if (num [i] % 2 != 0) {
                num [i] += 1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
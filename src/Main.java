import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int [] width = new int [3];
        width [0] = 1;
        width [1] = 2;
        width [2] = 3;

        float[] height = {1.57f, 7.654f, 9.986f};

        int [] thickness = {10, 20, 30};

        System.out.println("Задача 2:");
        for (int i = 0; i < width.length; i++) {
            if (i == width.length - 1) {
                System.out.print(width[i]);
                break;
            }
            System.out.print(width[i] + ", ");
        }
        System.out.println();
        for (int r = 0; r < height.length; r++) {
            if (r == height.length - 1) {
                System.out.print(height[r]);
                break;
            }
            System.out.print(height[r] + ", ");
        }
        System.out.println();
        for (int t = 0; t < thickness.length; t++) {
            if (t == thickness.length - 1) {
                System.out.print(thickness[t]);
                break;
            }
            System.out.print(thickness[t] + ", ");
        }
        System.out.println();


        System.out.println("Задача 3:");
        for (int i = width.length - 1; i >= 0; i--) {
            System.out.print(width[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = height.length - 1; i >= 0; i--) {
            System.out.print(height[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = thickness.length - 1; i >= 0; i--) {
            System.out.print(thickness[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4:");
        for (int i = 0; i < width.length; i++) {
            if (width[i] % 2 != 0) {
                width[i] += 1;
                System.out.print(width[i]+", ");
            }
        }
        System.out.println();
    }
}
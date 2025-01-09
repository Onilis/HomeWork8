import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers1 = {1.57, 7.654, 9.986};
        int[] arbitraryArray = {93, 36, 54};
        System.out.println();


        System.out.println("Задача № 2");
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2]);
        System.out.println(arbitraryArray[0] + ", " + arbitraryArray[1] + ", " + arbitraryArray[2]);


        System.out.println("Задача № 3");

        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(numbers1[2] + ", " + numbers1[1] + ", " + numbers1[0]);
        System.out.println(arbitraryArray[2] + ", " + arbitraryArray[1] + ", " + arbitraryArray[0]);

        System.out.println("Задача №4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] += 1;
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}
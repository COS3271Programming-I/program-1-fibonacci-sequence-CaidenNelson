import java.util.Arrays;
import java.util.Scanner;

public class fibonacciSequence {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numbers = {1, 1};
        int length;

        System.out.println("How many fibonacci numbers would you like?");
        length = userinput.nextInt();

        for(int i = 0; i < length; i++ ) {
            System.out.print(Arrays.toString(numbers) + " ");
            numbers[0] = numbers[1] + numbers[0];
            numbers[1] = numbers[1] + numbers[0];
        }
    }
}

import java.util.Scanner;

public class DivisibilityByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findDivisibility(array);
        System.out.println("Output : " + output);
    }

    private static int findDivisibility(int[] array) {
        int N = array.length, sum = 0;
        for (int i = 0; i < N; i++){
            sum += (array[i] * Math.pow(10, N-i)) % 3;
        }
        return (sum % 3 == 0) ? 1 : 0;
    }
}

import java.util.Scanner;

public class Greatestandsmallestelements {
    public static int findMinimum(int[] arr){
        int min = arr[0];
        for (int num : arr){
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int num : arr) {
            if (num < min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args){
        if (args.length > 0){
            int[] arrayFromArgs = new int[args.length];
            for (int i = 0; i < args.length; i++){
                arrayFromArgs[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Using command-line arguments:");
            System.out.println("Minimum: " + findMinimum(arrayFromArgs));
            System.out.println("Maximum: " + findMaximum(arrayFromArgs));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arrayFromScanner = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrayFromScanner[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Using Scanner input:");
        System.out.println("Minimum: " + findMinimum(arrayFromScanner));
        System.out.println("Maximum: " + findMaximum(arrayFromScanner));

        int[] minAndMax = findMinAndMax(arrayFromScanner);
        System.out.println("Using findMinAndMax method:");
        System.out.println("Minimum: " + minAndMax[0]);
        System.out.println("Maximum: " + minAndMax[1]);
    }
}

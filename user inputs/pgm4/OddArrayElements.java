import java.util.Scanner;

public class OddArrayElements {
    public static void main(String[] args){
        int i, limit;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        int[] products = new int[limit];
        System.out.println("Enter array elements:");
        for (i = 0; i < limit; i++) {
            products[i] = read.nextInt();
        }
        System.out.println("\nArray elements in odd position:");
        System.out.println("___________________________________");
        for (i = 0; i < limit; i = i + 2) {
            System.out.println(products[i]);
        }
    }
}
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = inp.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}

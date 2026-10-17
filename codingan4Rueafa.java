import java.util.Scanner;
public class codingan4Rueafa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N = ");
        int n = sc.nextInt();

        System.out.println( " Outpun: ");
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                if (j < i) System.out.print(" ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
    
    


import java.util.Scanner;
public class coding2arefa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Maasukan N:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            
            if (i%2 == 0) {
                sum += i;
            }
        }
                System.out.print ("sum of even number = " +sum);
                sc.close();
            }

    }

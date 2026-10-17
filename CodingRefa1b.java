import java.util.Scanner;
public class CodingRefa1b {
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--)
{
        System.out.print(i);
        if (i > 1)
            System.out.print(" ");
    }
    System.out.println();
    System.out.println("star!");
    sc.close();
 }
}
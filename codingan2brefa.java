import java.util.Scanner;
public class codingan2brefa {
        public static void main(String[] args) {
            Scanner sc = new 
            Scanner (System.in);
            System.out.print("Masukan N:");
            int n = sc.nextInt();
            long faktorial = 1;
            for (int i=2; i<=n; i++)

                faktorial *=i;
                System.out.print(n+ "! =" + faktorial);
                sc.close();
        }
    }

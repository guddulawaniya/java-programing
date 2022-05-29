import java.util.Scanner;

public class fank { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value ; ");

        int n= sc.nextInt();
        int j;


        for(int i=n;i>=1;--i)
        {
            for( j=1;j<=n-i;++j)
            {
                System.out.print(" ");

            }
            for(;j<=n;++j)
            {
                System.out.print("*"); 
            }

            System.out.println();
        }

        for(int i=1;i<=n;++i)
        {
            for(j=1;j<=n;++j)
            {
                System.out.print(" ");

            }
            for(j=1;j<=i;++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

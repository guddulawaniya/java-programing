import java.util.Scanner;

public class ice_cream { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the values : ");

        int n = sc.nextInt();

        int j;
        for(int i=1;i<=n/2 ;++i)
        {
            for( j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("* ");

            }
            System.out.println();

        }

        for(int i=n;i>=1 ;--i)
        {
            for( j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    
}

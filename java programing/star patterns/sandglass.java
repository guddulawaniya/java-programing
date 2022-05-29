import java.util.Scanner;

public class sandglass {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int n = sc.nextInt();

        int i,j;

        for(i=n;i>=1;--i)
        {
            for(j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
        for(i=1;i<=n;++i)
        {
            for(j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}

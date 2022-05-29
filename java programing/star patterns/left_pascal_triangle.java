import java.util.Scanner;

public class left_pascal_triangle {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.print("Enter the values : ");
        int j;

        int n = s.nextInt();
        for(int i=1;i<=n;++i)
        {
            for(j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }
        for(int i=n;i>=1;--i)
        {
            for(j=1;j<=n-i+1;++j)
            {
                System.out.print(" ");
            }
            for(;j<=n;++j)
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
    
}

import java.util.Scanner;

public class  right_triangle {
    public static void main(String[] args) {

        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j,i;

        for( i=1; i<=n;++i)
        {
            for( j=1;j<=m-i;++j)
            {
                System.out.print(" ");

            }
            for(;j<=m;++j)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
}

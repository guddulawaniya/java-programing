import java.util.Scanner;

public class hellow_pattern {

    public static void main(String[] args) {
        System.out.println("Enter the values : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int j,i;
        for(i=1;i<=n;++i)
        {
            for(j=1;j<=m;++j)
            {

                if(i==1|| j==1 || j==m||i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }

            System.out.print("\n");
        }

    }
    
}

import java.util.Scanner;

public class pascal { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values : ");

        int n = sc.nextInt();

        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print(j+" ");
            }

            System.out.print("\n");
        }
        for(int i=n;i>=1;--i)
        {
            for(int j=1;j<=i-1;++j)
            {
                System.out.print(j+" ");
            }

            System.out.print("\n");
        }
    }
    
}

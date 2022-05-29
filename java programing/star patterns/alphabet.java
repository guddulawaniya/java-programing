import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter trhe value : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=n-1;++j)
            {
                if(i==1||j==1||j==n-1||i == n/2+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }


            System.out.print("\n");
        }
    }
    
}

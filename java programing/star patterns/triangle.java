import java.util.Scanner;

public class  triangle {
    public static void main(String[] args) {
       
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j,i;

        for( i=1; i<=n;++i)
        {
            for( j=1;j<=n-i;++j)
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





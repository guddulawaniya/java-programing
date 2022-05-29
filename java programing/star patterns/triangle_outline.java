import java.util.Scanner;

public class triangle_outline {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int  n = sc.nextInt();

        int i,j;
        for(i=1;i<=n;++i)
        {
            for(j=1;j<=n-i;++j)
            {

                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);++k)
            {
                if(k==1||i==n||k==2*i-1)
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

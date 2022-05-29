import java.util.Scanner;

public class pattern_4 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        

        System.out.println("Enter the values : ");
        int n = sc.nextInt();
        int i ,j;
        for(i=1;i<=n;++i)
        {
            for(j=1;j<=i;++j)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }

    }
}

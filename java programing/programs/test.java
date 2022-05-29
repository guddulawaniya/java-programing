import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sql.rowset.spi.SyncFactoryException;

class test 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i=1;
        while(i<=n)
        {
            if(i%3==0)
            {
                if(i%5==0)
                {
                    System.out.println("FizzaBuzz");
                }
                else
                    System.out.println("Fizza");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else if(i%5==0 && i%3==0 )
            {
                System.out.println("FizzaBuzz");
            }
            else 
            {
                System.out.println(i);
            }

            i++;

        }

      
        
        }
    }
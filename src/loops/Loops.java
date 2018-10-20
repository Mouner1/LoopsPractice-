/*
Mouner Dabjan
October 20 2018
Practice Loops 
 */
package loops;
import java.util.Scanner; 
/**
 *
 * @author canada
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variable 
        int choice = 0; 
        
        Scanner keyedInput = new Scanner(System.in); 
        
       // program-starter
       
        System.out.println("Cool Counting Program");
        System.out.println("Please enter your choice");
        System.out.println("1.......Count from 0 to 10 by 1");
        System.out.println("2.......Count from 100 to 0 by 10");
        System.out.println("3.......Count from 50 to 500 by 50");
        System.out.println("4.......Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        
        choice = keyedInput.nextInt(); 
        
        System.out.println("------------------------------------------------------------"); 
        
        // if-statements and loops
        
        if (choice==1)
        {
            System.out.println("You have chosen to count from 0 to 10 by 1");
            for (int i = 0; i<=10; i = i + 1)
            {
                System.out.println(i);
            }
        }
        
        if (choice==2)
        {
            System.out.println("You have chosen to count from 100 to 0 by 10");
            for (int j = 100; j>=0; j = j - 10)
            {
                System.out.println(j);
            }
        }
        
        if (choice==3)
        {
            System.out.println("You have chosen to count from 50 to 500 by 50");
            for (int k = 50; k<=500; k = k + 50)
            {
                System.out.println(k);
            }
        }
        
        if (choice==4)
        {
            System.out.println("You have chosen to count from 6000 to 1000 by 1000");
            for ( int m = 6000; m>=100 ; m = m - 1000)
            {
                System.out.println(m);
            }
        }
        
        
         
    }
    
}

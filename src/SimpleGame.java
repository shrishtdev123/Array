import java.util.Scanner;

public class SimpleGame {

       public void guess()
       {
           System.out.println("enter any number from 1 to 10");
           Scanner sc=new Scanner((System.in));
           int n=sc.nextInt();
               if(n==7||n==9)
               {
                   System.out.println("you win the game");
                    System.exit(0);
               }
           System.out.println("cheak you luck : sorry");
               guess();
       }

    public static void main(String[] args)
    {
        SimpleGame t=new SimpleGame();
        t.guess();

    }
}

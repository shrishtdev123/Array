import java.util.ArrayList;
import java.util.Scanner;

public class PizzabilCalculator
{


     // function to add item

    public static void main(String[] args)
    {
        PizzabilCalculator food=new PizzabilCalculator();
        ArrayList<String> l=new ArrayList<>();
        Scanner sc=new Scanner((System.in));
        while(true)
        {
            System.out.println("1.add the item");
            System.out.println("2.remove the item");
            System.out.println("3.see the item");
            System.out.println("4.exit");
            System.out.println("Enter the choice");
            int ch=sc.nextInt();
            sc.nextLine();
            if(ch==1)
            {
                System.out.println("enter the item");
                String  item=sc.nextLine();
                sc.nextLine();
                l.add(item);

            }
            else if(ch==2)
            {
                System.out.println("enter the index of item which you want to remove");
                int t=sc.nextInt();
                 sc.nextLine();
                l.remove(t);
            }
            else if(ch==3)
            {
                System.out.println(l);

            }
            else if(ch==4)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Please enter the valid option");
            }
        }


    }
}

import java.util.Scanner;

public class Bank
{

    int balance;
    int amount;

    Bank(int amount)
    {
        this.balance=200;
        this.amount=amount;

    }
    public int deposite(int amount)
    {
        if(amount<balance)
        {
            System.out.println("enter the valid amount");
        }
        balance+=amount;
        return balance;
    }
    public int take(int amount)
    {
        if(amount>balance)
        {
            System.out.println("enter amount less than or equal to balance");
        }
        else
        {
            balance-=amount;

        }
        return balance;
    }
    public int getBalance()
    {
        return balance;
    }


    public static void main(String[] args)
    {
        Bank t=new Bank(200);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("-------------Welcome to new banke-----------");
            System.out.println("1.Deposite");
            System.out.println("2.take out");
            System.out.println("3.show");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("enter the amount which you want to deposit");
                int n=sc.nextInt();
                t.deposite(n);
            }
            else if(ch==2)
            {
                System.out.println("enter the amount which you want to take out");
                int n=sc.nextInt();
                t.take(n);
            }
            else if(ch==3)
            {
                System.out.println(t.getBalance());
            }
            else if(ch==4)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Enter the valide choice");
            }

        }





    }

}

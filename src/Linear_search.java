import java.util.Scanner;

public class Linear_search
{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the array element:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The array element are :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the item which you want to search ");
        int item=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {

            if(a[i]==item)
            {
                System.out.println("Item found at index "+i);
                 return;

            }
        }



    }
}

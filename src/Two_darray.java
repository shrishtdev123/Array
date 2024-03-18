import java.util.Scanner;

public class Two_darray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row=sc.nextInt();
        System.out.println("Enter the colum");
        int col=sc.nextInt();
//
        // create the two d array having size row and col
        int[][] a=new int[row][col];
        // taking element from the user
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        // printing the 2d array
        System.out.println("The given 2 D array is :");
        for(int i=0;i<a.length;i++)
           {
               for(int j=0;j<a[i].length;j++)
               {
                   System.out.print(a[i][j]+" ");
               }
               System.out.println();
           }

        // sum of 2d array are
         int sum=0;
         for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a[i].length;j++)
             {
                  sum+=a[i][j];
             }
         }

        System.out.println("the sum of matrix is :"+sum);
    }
}

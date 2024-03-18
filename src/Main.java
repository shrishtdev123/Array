import java.util.ArrayList;

public class Main
{

      public int fact(int n)
      {
          if(n==1)
              return 1;
          return n*fact(n-1);
      }
    public static void main(String[] args)
    {
           int[] a={10,3,4,5,6,7,12};
           int n=a.length;
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                l1.add(a[i]);
            }
            else
            {
                l2.add(a[i]);
            }
        }

        int min =l1.get(0);
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i)<min)
            {
                min=l1.get(i);
            }
        }
        System.out.println("The  min even number in the list is: "+ min);
        Main t=new  Main();
        System.out.println("The factorial of "+min+" is:"+ t.fact(min));

         min =l2.get(0);
        for(int i=0;i<l2.size();i++)
        {
            if(l2.get(i)<min)
            {
                min=l2.get(i);
            }
        }
        System.out.println("The  min odd number in the list is: "+ min);
        System.out.println("The factorial of "+min+" is:"+ t.fact(min));



    }
}
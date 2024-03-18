import java.util.ArrayList;

public class Factorial
{
    public   int fact(int n)
    {
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args)
    {
          //creation of object
         Factorial f=new Factorial();
       int[] a={2,3,4,5,6,7,8,9};
       int m=a.length;
        ArrayList<Integer> temp=new ArrayList<>();
       for(int i=0;i<m;i++)
       {
           if(a[i]%2==0)
           {
               int t= f.fact(i);
               temp.add(t);

           }
       }

        System.out.println(temp);




    }
}


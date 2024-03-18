import java.util.ArrayList;

public class LastIndex
{
    public static void main(String[] args)
    {
       int n=123;
        ArrayList<Integer> l=new ArrayList<>();


    while(n>0)
    {
        int rem = n % 10;
        l.add(rem);
        n = n / 10;
    }


        int[] t=new int[l.size()];

       for(int i=l.size()-1;i>=0;i--)
       {
            t[i]=l.get(i);

       }
       for(int i=t.length-1;i>=0;i--)
       {
           System.out.print(t[i]+" ");
       }



    }
}




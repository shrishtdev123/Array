import java.util.ArrayList;

public class MaxSum
{
   public int digitsum(int n)
   {
       if(n==0)
           return 0;
       return n%10+ digitsum(n/10);
   }
    public static void main(String[] args)
    {

        MaxSum t=new MaxSum();
        int max=0;
        int temp=0;
        int i;
        ArrayList<Integer> l=new ArrayList<>();
        for(i=0;i<=137;i++)
        {
            l.add(t.digitsum(i));
            if(t.digitsum(i)>max)
            {
                max=t.digitsum(i);
                temp=i;


            }

        }

        System.out.println(temp);


//



    }
}

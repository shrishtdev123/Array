import java.util.*;


public class PlusOne
{
    public static void main(String[] args)
    {
         int[] digits={1,2,3};
         ArrayList<Integer> l=new ArrayList<>();
         ArrayList<Integer> l1=new ArrayList<>();
           int n=digits[digits.length-1]+1;
        if(n<10)
        {
            for(int i=0;i<digits.length-1;i++)
            {
                l.add(digits[i]);
            }
            l.add(n);
        }
        else
        {
            for(int i=0;i<digits.length-1;i++)
            {
                l.add(digits[i]);
            }

                while(n>0)
                {
                    int rem=n%10;
                    l1.add(rem);
                      n=n/10;
                }
                for(int i=l1.size();i>=0;i--)
                {
                    l.add(l1.get(i));
                }
        }

        System.out.println(l);

    }
}

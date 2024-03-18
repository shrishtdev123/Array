public class digitsum
{
     public int digit_sum(int n)
     {   int temp=n;
         if(temp==0)
         {
             return n;

         }
         System.out.println(temp);
         return digit_sum(temp-1);
     }
    public static void main(String[] args)
    {
        digitsum t=new digitsum();
        t.digit_sum(21);
    }
}





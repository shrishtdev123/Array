public class Buy_Sell
{
    public static void main(String[] args)
    {
         int[] price={1};
         int min=price[0];
         int x=0;
//        if(price[1]>price[0])
//        {
//            System.out.println(price[1]-price[0]);
//        }
        if(price.length==1)
        {
            System.out.println(price[0]);
        }
         else if(min<price[1])
         {
              int max=price[1];
              for(int i=2;i<price.length;i++)
              {
                  if(price[i]>max)
                  {
                      max=price[i];
                  }
              }
             System.out.println(max-min);
         }
         else
         {

             for (int i = 1; i < price.length; i++)
             {
                 if (price[i] < min)
                 {
                     x = i;
                     min = price[i];
                 }
             }

             int max=price[x];
             for(int i=x;i<price.length;i++)
             {
                 if(price[i]>max)
                 {
                     max=price[i];
                 }
             }

             // profit =max-min

             if(max-min>0)
             {
                 System.out.println(max-min);
             }
             else
             {
                 System.out.println(0);
             }

         }

        // now find the maximum value after the min value from index at which min value is found

    }
}


      
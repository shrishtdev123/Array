import java.util.HashSet;
import java.util.Iterator;

public class SingleElement
{
    public static void main(String[] args)
    {
        int[] a={4,1,2,1,2};
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int t:a)
        {
            if(!set1.add(t))
            {
               if( set2.add(t))
               {
                   set1.remove(t);
               }
            }
        }
        System.out.println(set1);
        Iterator<Integer> itr= set1.iterator();
        int temp=0;
        while(itr.hasNext())
        {
            Integer item=itr.next();
             temp=item;
        }

        System.out.println(temp);



    }
}

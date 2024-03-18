import java.util.HashSet;
import java.util.Iterator;

public class hashSet
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(10);
//        set.add(40);
//        System.out.println(set);
//        System.out.println(set.size());
        // to print the element of any collections
//        Iterator<Integer> iterator = set.iterator();
//
//        while (iterator.hasNext())
//        {
//            Integer element = iterator.next();
//
//        }
   int[] a={1,2,3,2,4,4,5};
         for(int i=0;i<a.length;i++)
         {
             set.add(a[i]);
         }
        Iterator<Integer> itr= set.iterator();
         int sum=0;
         while(itr.hasNext())
         {
             Integer temp=itr.next();
              sum+=temp;

         }
        System.out.println(sum);
        System.out.println(set);

        // from the above discussion we can conclude that if we want to
        // travel on collection than we have three method by which
        // one of them is iterator
    }

}

import java.util.*;

public class MissingAndDublicat
{

    public static void main(String[] args)
    {
        int[] arr = { 6, 4, 3, 5, 5, 1};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr)
        {
            set.add(num);
        }

        int[] newarray = new int[set.size()];
        int index = 0;
        for (int num : set)
        {
            newarray[index] = num;
            index++;
        }

        int sum=0;
        for(int i=0;i<newarray.length;i++)
        {
            sum+=newarray[i];
        }
        System.out.println(sum);
        // now finding 1to n

      int sum1=0;
      for(int i=1;i<= arr.length;i++)
      {
          sum1+=i;
      }

      int misingNumber=sum1-sum;
        System.out.println(misingNumber);


       // now find the dublicate number

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr)
        {
            if (!set1.add(num))
            { // If the element already exists in the set, add it to duplicates set
                duplicates.add(num);
            }
        }
        Iterator<Integer> iterator = duplicates.iterator();
        int dublicate=0;
        while (iterator.hasNext())
        {
            Integer element = iterator.next();
             dublicate=element;
        }
       int[] a=new int[2];
        a[0]=misingNumber;
        a[1]=dublicate;

        System.out.println(Arrays.toString(a));



    }



}

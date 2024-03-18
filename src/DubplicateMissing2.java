import java.util.*;

public class DubplicateMissing2
{

    public static void main(String[] args)
    {
        int[] result = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(4);


        int n = arrayList.size();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arrayList)
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
        for(int i=1;i<= arrayList.size();i++)
        {
            sum1+=i;
        }

        int misingNumber=sum1-sum;
        result[0]=misingNumber;
        System.out.println(misingNumber);
        // Calculate the sum of the given array and the sum of 1 to n


        // Find the duplicate number
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arrayList)
        {
            if (!set1.add(num))
            {
                result[1] = num;
                break; // Found the duplicate, no need to continue
            }
        }

        System.out.println(Arrays.toString(result));

    }
}

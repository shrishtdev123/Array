import java.util.*;

public class DuplicateNumber
{

    public static void main(String[] args)
    {
        int[] arr = { 6, 4, 3, 5, 5, 1};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr)
        {
            if (!set.add(num))
            { // If the element already exists in the set, add it to duplicates set
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements in the array: " + duplicates);

    }
}

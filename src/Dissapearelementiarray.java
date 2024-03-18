import java.util.ArrayList;

public class Dissapearelementiarray
{
    public static void main(String[] args)
    {
        int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = a.length;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            l.add(i);
        }

        for (int j = 0; j < l.size(); j++)
        {
            boolean found = false;
            for (int i = 0; i < n; i++)
            {
                if (l.get(j) == a[i])
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                l1.add(l.get(j));
            }
        }
        System.out.println(l1);


    }
}

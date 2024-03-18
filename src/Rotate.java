import java.util.ArrayList;

public class Rotate
{

    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i=0;i<=k;i++)
        {
            l1.add(a[i]);
        }
        System.out.println(l1);
        for(int i=k+1;i<=a.length-1;i++)
        {
            l2.add(a[i]);
        }
        System.out.println(l2);

        for(int i=0;i<l2.size();i++)
        {
            l3.add(l2.get(i));
        }
        System.out.println(l3);
      for(int i=0;i<l1.size();i++)
      {
          l3.add(l1.get(i));
      }
      for(int i=0;i<l3.size();i++)
      {
          a[i]=l3.get(i);
      }

      for(int i=0;i<a.length;i++)
      {
          System.out.print(a[i]+" ");
      }

    }
}

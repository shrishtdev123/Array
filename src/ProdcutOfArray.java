import java.util.ArrayList;

public class ProdcutOfArray
{
    public static void main(String[] args)
    {

        int[] a={1,2,3,4};
        int[] ans=new int[a.length];
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int pro=1;
        for(int i=0;i<a.length;i++)
        {
             for(int j=0;j<a.length;j++)
             {
                      if(i!=j)
                      {
                          l.add(a[j]);
                      }
             }
             for(int t=0;t<l.size();t++)
             {
                 pro=pro*l.get(t);
             }
           l2.add(pro);
             pro=1;
             l.clear();

        }


        for(int m=0;m<l2.size();m++)
        {
            ans[m]=l2.get(m);
        }

        for(int c=0;c<ans.length;c++)
        {
            System.out.print(ans[c]+" ");
        }


    }


}


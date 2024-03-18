import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Countarrray
{
    public static void main(String[] args)
    {

        ArrayList<ArrayList<Integer>> t=new ArrayList<>();
         for(int i=0;i<5;i++)
         {
             ArrayList<Integer> l=new ArrayList<>();
             for(int j=0;j<6;j++)
             {
                 l.add(j);

             }
             t.add(l);
         }
        System.out.println(t);




    }

}

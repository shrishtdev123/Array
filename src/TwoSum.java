import java.util.ArrayList;

public class TwoSum
{
    ArrayList<Integer> temp=new ArrayList<>();
    ArrayList<Integer> l=new ArrayList<>();

     public int twosum(int a[],int n,int index,int target)
     {
         if(target==0)
         {
             
         }
         if(n==index ||target<0)
         {
             return -1;
         }
         // not take
          twosum(a,n,index+1,target);

           l.add(a[index]);
          twosum(a,n,index+1,target-a[index]);
         System.out.println(l);
           return 0;
     }

    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int n=a.length;
        int target=9;
        TwoSum t=new  TwoSum();
        t.twosum(a,n,0,target);
    }
}


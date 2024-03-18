import java.util.ArrayList;

public class RemoveElement
{

    public static void main(String[] args) {

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int[] nums={1,2,3,4,};
        int val=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                l1.add(nums[i]);
            }
            else
            {
                l2.add(nums[i]);
            }
        }
        System.out.println(l2.size());
    }
}

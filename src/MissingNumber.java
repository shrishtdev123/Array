public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] a={3,0,1};
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }

        int sum1=0;

        for(int i=0;i<=n;i++)
        {
            sum1+=i;
        }
        System.out.println(sum1-sum);
    }
}



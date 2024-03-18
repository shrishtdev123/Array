import java.util.ArrayList;

public class MatchString
{
    public static void main(String[] args)
    {
        String s = "   fly me   to   the moon  ";
        int i;
        ArrayList<String> l=new ArrayList<>();

        int count1=0;

        int n=s.length();
        int count=0;
        int x=0;

        for ( i = 0; i <n; i++)
        {



            if (s.charAt(i) != ' ')
            {
               count++;
               x=count;

            }
            else
            {
               if(s.charAt(i)==' ')
                {
                    count=0;
                }

            }



        }
        System.out.println(x);



    }
}

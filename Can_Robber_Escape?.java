import java.util.Scanner;
class escape
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int c=0;
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                c++;
            }
        }
        if(c>2)
        {
            System.out.format("NO");
        }
        else
        {
            System.out.format("YES");
        }
    }
}
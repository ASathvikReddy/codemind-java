import java.util.Scanner;
class val
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String c=s.next();
        for(int i=0;i<c.length();i++)
        {
            int ch=c.charAt(i);
            System.out.format("%d",ch);
        }
    }
}
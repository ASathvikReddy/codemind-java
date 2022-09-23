import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        System.out.format("%.4f",(a+b)/2);
    }
}
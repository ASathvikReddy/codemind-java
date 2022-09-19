import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double d=(a+b+c)/2;
        double ar=Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.format("%.2f",ar);
    }
}
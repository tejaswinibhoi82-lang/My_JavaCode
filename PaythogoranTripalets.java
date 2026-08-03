import java.util.Scanner;
public class PaythogoranTripalets {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        CalcPaythogoreanTriplets(a,b,c);
    }
    public static void CalcPaythogoreanTriplets(int a,int b,int c)
        {
          int p=a*a;
          int q=b*b;
          int r=c*c;
          if((p+q)==r)
          {
              System.out.println(a+" "+b+" "+c+" "+"number is paythogoreanTriplets");
          }
          else{
              System.out.println(a+" "+b+" "+c+" "+"number is not paythogoreanTriplets");

          }
        }
}

package Hello;
import java.util.Scanner;
public class weight {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kilagm");
        double weightkgs=sc.nextDouble();
        convert(weightkgs);

    }
    public static void convert(double Kgs) {
        double weightGms, weightMg;
        weightGms = Kgs * 1000;
        weightMg = weightGms * 1000;
        System.out.println("The converted weight in grams is = " + weightGms);
        System.out.println("The converted weight in miligrams is = " + weightMg);

    }
}

package first;
import java.util.Scanner;
class Calculation{
    double radius;
    double area;
    double circumference;
    final double  PI = 3.14;
    double calc(double r){
        area=PI*r*r;
        return area;
    }
}
public class Circle {
	 public static void main(String[] args) {
	        Calculation c = new Calculation();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the radius:");
	        double r= sc.nextDouble();
	        System.out.println(c.calc(r));
	        sc.close();        
	    }
}

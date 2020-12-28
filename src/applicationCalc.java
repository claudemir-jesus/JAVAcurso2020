import java.util.Scanner;
import Util.Calc;
public class applicationCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com Radius: ");
		double radius = sc.nextDouble();
		double c = Calc.circo(radius);
		double v = Calc.vol(radius);
		
		System.out.println(c);
		System.out.println(v);
		System.out.print(Calc.PI);
		
		
		sc.close();
		
	}

}

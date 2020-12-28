import java.util.Scanner;
public class ternariaV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 50.0) ? preco * 0.10 : preco * 0.30;
		System.out.println("Valor desconto: " + "R$" + desconto);
		System.out.println("Total a pagar: " + "R$" + (preco - desconto));
		
		sc.close();
	}
  }

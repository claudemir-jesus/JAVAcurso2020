import java.util.Scanner;

public class comulativaV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// variavel valor da franquia
		int conta = 15;
		int minutos = sc.nextInt();
		// Calculo da franquia
		if (minutos > 100) {
			conta += (minutos - 100) * 0.78;
		}

		System.out.print(conta);
		sc.close();

	}

}

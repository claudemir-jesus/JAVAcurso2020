import java.util.Scanner;
public class funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite os valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int h = max(a, b, c);
		
		showresult(h);
		
		
		
		
		
		
		
		sc.close();
	}

    public static int max(int x, int y, int z) { //função calculo maior valor
    int aux;
    if (x > y && x > z) {
    	aux = x;
    } else if (y > z) {
    	aux = y;
    } else {
    	aux = z;
    } return aux;
    }
     public static void showresult(int value) {
    	System.out.println("O maior valor é " +  value);
    	
}
}
    


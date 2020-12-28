import java.util.Scanner;
public class entradaDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated 
        Scanner sc = new Scanner(System.in); // scanner teclado
        // Variaveis do projeto
        int x, x1, x2;
        int area;
     
        
        // Captura de entrada de dados user
        x = sc.nextInt();
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        area = x + x1 + x2;
        
        System.out.print(area);
        
        
        
        
        
        sc.close();
    		   
	}

}

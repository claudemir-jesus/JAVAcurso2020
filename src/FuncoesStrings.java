
public class FuncoesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* calcula String
		 * funções especiais string
		 */
		
		String original = "hjheuUIII-UuiuiiOIO-090909090-uygbfBDFDFDFDiieieiiieh";
		String b = "Honda Civic Yamaha Zinco Terra Ouro Rua Pão alegria paz amor";
		String s = original.toLowerCase();
		String z = original.toUpperCase();
		String w = original.substring(2, 11);
		
		String[] vect = b.split(" ");
		
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		
		
		System.out.println(s); // imprime na tela s
		System.out.println(z);
		System.out.println(w);
				
		
		

	}

}

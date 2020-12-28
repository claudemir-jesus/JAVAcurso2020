import java.util.ArrayList;
import java.util.List;

public class ListAULA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("bob");
		list.add("Paulo");
		list.add(0, "Marco");
		
		for (String x : list) {
			System.out.println(x);
			System.out.println("-------------------------");
			String name = list.stream().filter(y -> y.charAt(0) == 'P').findFirst().orElse(null);
			System.out.println(name);
		}
		
	}
		
		
}


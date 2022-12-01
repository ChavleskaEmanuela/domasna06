package zadaca10;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		
		lista1.add("eden");
		lista1.add("dva");
		lista1.add("tri");
		
		lista2.add("cetiri");
		lista2.add("pet");
		
		lista1.addAll(lista2);
		
		System.out.println(lista1);
	}
}

package zadaca11;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	
				List<String> lista1 = new ArrayList<>();
				List<String> lista2 = new ArrayList<>();
				
				lista1.add("eden");
				lista1.add("osum");
				lista1.add("tri");
				
				lista2.add("tri");
				lista2.add("pet");
				lista2.add("osum");
				lista2.add("eden");
				
				lista1.retainAll(lista2);
				
				System.out.println(lista1);
		}

	}

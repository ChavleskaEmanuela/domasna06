package zadaca04;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;  

public class Main {
	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		broevi.add(15);
		broevi.add(9);
		broevi.add(25);
		broevi.add(19);
Collections.sort(broevi);
		System.out.println(broevi);
	}
}

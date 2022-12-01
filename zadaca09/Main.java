package zadaca09;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Fakultet> fakultet = new ArrayList<Fakultet>();
		fakultet.add(new Fakultet("FIKT", 2, 200));
		fakultet.add(new Fakultet ("TFB", 5, 600));
		fakultet.add(new Fakultet ("Pedagoski Fakultet", 7, 550));
		fakultet.add(new Fakultet ("FINKI", 7, 2000));
		fakultet.add(new Fakultet ("PMF", 6, 380));
		
		for (int i = 0; i < fakultet.size(); i ++){
			System.out.println(fakultet.get(i).getIme());
			System.out.println("Broj na smerovi: "+ fakultet.get(i).getSmerovi());
			System.out.println("Broj na studenti: " + fakultet.get(i).getStudenti()+"\n");
			}
		
	}
}

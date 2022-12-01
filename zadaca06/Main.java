package zadaca06;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<String> mail = new ArrayList<>();
		
		for(int i=1; i<=20; i++) {
			mail.add("mail"+i+"@yahoo.com");
		}
		System.out.println(mail);
	}
}

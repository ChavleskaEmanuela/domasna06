package zadaca08;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<String> mail = new ArrayList<>();
		for(int i=5; i<=20; i+=5) {
			mail.add("mail"+i+"@yahoo.com");
		}
		System.out.println(mail);
	}
}

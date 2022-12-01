package zadaca07;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	List<String> mail = new ArrayList<>();
	for(int i = 1; i <= 20; i++) {
		if(i<10) {
			mail.add("mail0"+i+"@yahoo.com");
		}
		else
			mail.add("mail"+i+"@yahoo.com");
	}
	System.out.println(mail);
	}
}

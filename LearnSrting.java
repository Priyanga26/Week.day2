package week1.day2;

//import java.util.Iterator;

public class LearnSrting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";

		char[] ChAr = str.toCharArray();
		for (int i = 0; i < ChAr.length; i++) {
			if (i % 2 != 0) {
				char ChUp = Character.toUpperCase(ChAr[i]);
				System.out.println(ChUp);
			} else
				System.out.println(ChAr[i]);

		}
	}
}

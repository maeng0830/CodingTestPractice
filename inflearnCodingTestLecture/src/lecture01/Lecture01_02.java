package lecture01;

import java.util.Scanner;

public class Lecture01_02 {
	public String solution(String str) {
		char change;
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			char origin = str.charAt(i);
			char lower = Character.toLowerCase(origin);
			
			
			if(origin == lower) {
				change = Character.toUpperCase(origin);
			} else {
				change = Character.toLowerCase(origin);
			}
			
			answer = answer + change;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Lecture01_02 T = new Lecture01_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		kb.close();
		System.out.println(T.solution(str));
	}

}

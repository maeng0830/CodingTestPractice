package lecture01;

import java.util.Scanner;

public class Lecture01_04 {
	public void solution(int n, String[] strs) {
		String answer;
		
		for(int i = 0; i < n; i++) {
			answer = "";
			String word = strs[i];
			for(int j = word.length()-1; j > -1; j--) {
				answer = answer + word.charAt(j);
			}
			System.out.println(answer);			
		}
	}

	public static void main(String[] args) {
		Lecture01_04 t = new Lecture01_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String[] strs = new String[n];
		
		for(int i = 0; i < strs.length; i++) {
			strs[i] = kb.next();
		}
		
		kb.close();
		t.solution(n, strs);
	}

}

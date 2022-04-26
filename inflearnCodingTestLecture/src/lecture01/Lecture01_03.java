package lecture01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lecture01_03 {
	public String solution(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		int tc = st.countTokens();
		String answer = "";
		
		for(int i = 0; i < tc; i++) {
			String comparison = st.nextToken();
			if(answer.length() > comparison.length()) {
				answer = answer;
			} else {
				answer = comparison;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Lecture01_03 t = new Lecture01_03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(t.solution(str));

	}

}

package lecture01;

import java.util.Scanner;

public class Lecture01_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		input1 = input1.toLowerCase();
		
		char input2 = scanner.next().charAt(0);
		input2 = Character.toLowerCase(input2);
		
		scanner.close();
		
		int counting = 0;
		
		for(int i = 0; i < input1.length(); i++) {
			char check = input1.charAt(i);
			if(check == input2) {
				counting++;
			}
		}
		
		System.out.println(counting);
		

	}

}

package testen;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int nummer1, nummer2;
		System.out.println("Voer 2 getallen in om deze te berekenen.");
		System.out.print("Voer getal 1 in, ==> ");
		nummer1 = input.nextInt();
		System.out.print("Voer getal 2 in, ==> ");
		nummer2 = input.nextInt();
		
		System.out.println("Optellen : " +add(nummer1, nummer2));
		System.out.println("aftrekken : " +subtract(nummer1, nummer2));
		System.out.println("Vermenigvuldigen : " +multply(nummer1, nummer2));
		System.out.println("Delen : " +devide(nummer1, nummer2));
		System.out.println("kwadraad : " +square(nummer1));
		System.out.println("Exponentieel : " +exponentiation(nummer1, nummer2));
	}

	
	
	public static int add(int number1, int number2) {
		int answer = number1 + number2;
		return answer;
	}

	public static int subtract(int number1, int number2) {
		int result = number1 - number2;
		return result;
	}

	public static int multply(int number1, int number2) {
		int answer = 0;
		int i;
		for (i=1;i<=number2;i++) {
		answer = answer + number1;
		}
		return answer;
	}
	

	
	public static int devide(int number1, int number2) {
		int answer = 0;
		while (number1 >= number2 ) {
			number1 = subtract(number1, number2);
			answer++;
		}
		return answer;
	}
	
	
	public static int square(int number1) {
		return multply(number1, number1);
	}

	
	public static int exponentiation(int number1, int number2) {
		int answer = 1;
		while (number2 > 0) {
			answer = multply(answer, number1);
			number2--;
		}
		return answer;
	}
	
	

}

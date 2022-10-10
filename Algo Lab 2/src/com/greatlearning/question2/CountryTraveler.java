package com.greatlearning.question2;

import java.util.Scanner;

public class CountryTraveler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountryTravelerService cts = new CountryTravelerService();

		System.out.println("Enter the Size of Currency Denominations");
		int denominaionSize = sc.nextInt();
		int currencyNotes[] = new int[denominaionSize];

		System.out.println("Enter the currency denominations value one by one");
		for (int i = 0; i < denominaionSize; i++) {
			currencyNotes[i] = sc.nextInt();
		}
		
		cts.sort(currencyNotes, 0, currencyNotes.length - 1);

		System.out.println("Enter the amount to pay");		
		int amount = sc.nextInt();
		cts.notesCountImplementation(currencyNotes, amount);
		
		sc.close();
	}

}

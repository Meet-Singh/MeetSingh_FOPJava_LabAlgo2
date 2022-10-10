package com.greatlearning.question1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayMoneyService pm = new PayMoneyService();

		System.out.println("Enter the sie of transaction array:");
		int transactionSize = sc.nextInt();
		System.out.println("Enter the transaction values:");
		int transactions[] = new int[transactionSize];
		for (int i = 0; i < transactionSize; i++) {
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTargets = sc.nextInt();

		while (totalTargets-- != 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int transactionTarget = pm.calculateTarget(transactions, target);
			if (transactionTarget != -1) {
				System.out.println("Target achieved in " + transactionTarget + " transactions \n");
			} else {
				System.out.println("Target is not achieved \n");
			}
		}

		sc.close();
	}

}

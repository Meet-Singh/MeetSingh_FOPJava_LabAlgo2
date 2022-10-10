package com.greatlearning.question1;

public class PayMoneyService {
	int calculateTarget(int[] transactions, int target) {
		int amount = 0, count = 0;
		for (int transaction : transactions) {
			count++;
			amount += transaction;
			if (amount >= target) {
				return count;
			}
		}
		return -1;
	}
}

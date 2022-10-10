package com.greatlearning.question2;

public class CountryTravelerService {
	void sort(int[] notes, int left, int right) {
		if (left < right) { 
			int mid = (left + right) / 2;
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			merge(notes, left, mid, right);
		}
	}
	
	void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	 void notesCountImplementation(int notes[], int amount) {
			int[] notesCounter = new int[notes.length];
			
			try {
				for (int i = 0; i < notes.length; i++) {
					if (amount >= notes[i]) {
						notesCounter[i] = amount / notes[i];
						amount = amount - notesCounter[i] * notes[i];
					}
				}
				
				if(amount > 0) {
					System.out.println("Higher denomination cannot be assign to the exact amount");	
				}else {
					System.out.println("Your payment approach in order to give min no of notes will be");
	       
					for (int i = 0; i < notes.length; i++) {
						if (notesCounter[i] != 0) {
							System.out.println(notes[i] + " : " + notesCounter[i]);
						}
					}
				}
			
			} catch(ArithmeticException e) {
				System.out.println(e+ "notes of denomination 0 is invalid");
			}
		}
}

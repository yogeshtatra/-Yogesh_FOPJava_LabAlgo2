package org.greatlearning.currency;

import java.util.Random;
import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//Random random = new Random();
		System.out.println("Enter the no of available currency Denominations");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value\n");
		int[] currencyDenomination = new int[size];
		for (int i = 0; i < size; i++) {
			currencyDenomination[i] = sc.nextInt();
		}

		// sorting of currency denominations through mergesort method by calling sorting method from a subclass
		SortingOfCurrency sorting = new SortingOfCurrency();
		sorting.sort(currencyDenomination, 0, currencyDenomination.length - 1);

		System.out.println("\nAvailable currency Denominatios in sorted order are:\n");
		for (int i = 0; i < currencyDenomination.length; i++) {
			System.out.print(currencyDenomination[i] + " ");
		}
		System.out.println("\nEnter the amount you want to pay");
		int amount = sc.nextInt();
		
		//Calling method to calculate the number of denominations of the currency required to make payment.
		CalculateCurrencyDenominations(currencyDenomination, amount);

	}

	private static void CalculateCurrencyDenominations(int[] currencyDenomination, int amount) {
		// TODO Auto-generated method stub
		int tempAmount = amount;
		int len = currencyDenomination.length;
		int[] noOfDenominations = new int[len];
		for (int i = 0; i < len; i++) {
			noOfDenominations[i] = tempAmount / currencyDenomination[i];
			tempAmount = tempAmount - (noOfDenominations[i] * currencyDenomination[i]);
		}
		System.out.println("Your payment approach in order to give min no of notes will be\n");
		for (int i = 0; i < len; i++) {
			if (noOfDenominations[i] != 0) {
				System.out.println(currencyDenomination[i] + ":" + noOfDenominations[i]);
			}
		}
	}

}

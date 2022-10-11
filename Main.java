package org.greatlearning.paymoneytransactions;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int size;
		int noOfTarget;
		System.out.println("Enter the size of transaction array ");
		size = sc.nextInt();

		double[] transactionArray = new double[size];
		System.out.println("Enter the transactional values \n");
		for (int i = 0; i < size; i++) {
			transactionArray[i] = sc.nextDouble();
		}
		System.out.print("Transactional values are: ");
		for (int i = 0; i < size; i++) {
			System.out.print(transactionArray[i] + " ");
		}
		System.out.println("\nEnter the total no of targets that needs to be achieve \n");
		noOfTarget = sc.nextInt();

		// Calling method from subclass to check target achieved or not
		DailyTransactionsTargets obj = new DailyTransactionsTargets();
		obj.checkTargetTransactions(transactionArray, noOfTarget);

	}
}
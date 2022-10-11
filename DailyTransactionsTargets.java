package org.greatlearning.paymoneytransactions;

import java.util.Scanner;

public class DailyTransactionsTargets {
	Scanner sc = new Scanner(System.in);

	void checkTargetTransactions(double[] array, int noOfTarget) {
		double target;
		while (noOfTarget != 0) {
			System.out.println("Enter the value of target \n");
			target = sc.nextDouble();
			int flag = 0;
			double sum = 0d;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i];
				if (target <= sum) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}

			}

			if (flag == 0)
				System.out.println("Target not achieved");
			noOfTarget--;
		}
	}
}

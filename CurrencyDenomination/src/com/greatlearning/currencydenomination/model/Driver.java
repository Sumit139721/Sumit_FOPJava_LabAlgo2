package com.greatlearning.currencydenomination.model;


import java.util.Scanner;

import com.greatlearning.currencydenomination.service.SortingClass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeCurrencyDenomination;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		sizeCurrencyDenomination = sc.nextInt();

		// declare integer array
		int[] currencyValue = new int[sizeCurrencyDenomination];
		int[] count = new int[sizeCurrencyDenomination];
		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < sizeCurrencyDenomination; i++) {
			currencyValue[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay: ");
		int amountPayable = sc.nextInt();
		sc.close();
		SortingClass sort1 = new SortingClass();
		currencyValue = sort1.sort(currencyValue);

		for (int i = 0; i < sizeCurrencyDenomination; i++) {

			if (amountPayable >= currencyValue[i]) {
				count[i] = amountPayable / currencyValue[i];
				amountPayable = amountPayable - count[i] * currencyValue[i];
			}

		}
		if (amountPayable > 0)
			System.out.println("Amount cannot be printed with given denominations");
		else {
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			for (int i = 0; i < sizeCurrencyDenomination; i++)
				System.out.println(currencyValue[i] + ":" + count[i]);
		}
	}

}

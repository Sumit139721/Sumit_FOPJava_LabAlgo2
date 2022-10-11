package com.greatlearning.driver;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTrans, target;

		System.out.println("Enter the number of transactions in an array:");
		noOfTrans = sc.nextInt();

		int[] transArray = new int[noOfTrans];

		System.out.println("Enter the transactions:");

		for (int i = 0; i < noOfTrans; i++) {
			transArray[i] = sc.nextInt();
		}

		System.out.println("What is the target needed to be achieved?");
		target = sc.nextInt();
		sc.close();
		// Logic to check target achieved or not for number of transactions.
		int checkVar = 0;
		int index = 1;
		boolean flag = false;
		
		for (int i = 0; i < noOfTrans; i++) {
			checkVar += transArray[i];
			
			if (checkVar >= target) {
				System.out.println("Target is achieved after " + index + " transactions");
				flag = true;
				break;
			}
			index += 1;
		}
		if (flag == false) {
			System.out.println("Target is not achieved");
		}
		
	}

}

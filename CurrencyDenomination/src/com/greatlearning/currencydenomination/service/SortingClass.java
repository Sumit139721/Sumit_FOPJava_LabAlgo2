package com.greatlearning.currencydenomination.service;

import java.util.Arrays;

public class SortingClass {
	public int[] sort(int[] arr) {
		if (arr.length ==1)
			return arr;

		int midVal = arr.length/2;
		int[] leftArr = new int[arr.length/2];
		int[] rightArr = new int[arr.length - leftArr.length];
		
		leftArr = Arrays.copyOfRange(arr, 0, midVal);
		leftArr = sort(leftArr);
		
		
		rightArr = Arrays.copyOfRange(arr, midVal, arr.length);
		rightArr = sort(rightArr);
		
		return mergeArray(leftArr, rightArr);
	}
	
	public int[] mergeArray(int[] left, int[] right) {
		int i=0, j=0, k=0;
		
		int[] sortedArr = new int[left.length+right.length];
		
		while(i<left.length && j<right.length) {
			if(left[i]>right[j]) {
				sortedArr[k]=left[i];
				i++;
			}
			else{
				sortedArr[k]=right[j];
				j++;
			}
			k++;
		}
		while (i<left.length) {
			sortedArr[k]=left[i];
			k++;
			i++;
		}
		while (j<right.length) {
			sortedArr[k]=right[j];
			k++;
			j++;
		}
		
		return sortedArr;
	}
}

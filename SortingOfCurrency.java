package org.greatlearning.currency;

public class SortingOfCurrency {

	void sort(int[] arr, int leftindex, int rightindex) {

		if (leftindex < rightindex) {
			int midindex = (leftindex + rightindex) / 2;
			sort(arr, leftindex, midindex);
			sort(arr, midindex + 1, rightindex);
			merge(arr, leftindex, midindex, rightindex);
		}
	}

	private void merge(int[] arr, int leftindex, int midindex, int rightindex) {
		// TODO Auto-generated method stub
		int leftsize = midindex - leftindex + 1;
		int rightsize = rightindex - midindex;
		int[] leftarray = new int[leftsize];
		int[] rightarray = new int[rightsize];

		// copy elements into left array upto midindex
		for (int i = 0; i < leftsize; i++) {
			leftarray[i] = arr[leftindex + i];
		}
		// copy elements into right array starting from midindex+1
		for (int i = 0; i < rightsize; i++) {
			rightarray[i] = arr[midindex + i + 1];
		}
		int i = 0, j = 0, k = leftindex;
		while (i < leftsize && j < rightsize) {
			if (leftarray[i] > rightarray[j]) {
				arr[k] = leftarray[i];
				i++;
			} else {
				arr[k] = rightarray[j];
				j++;
			}
			k++;
		}
		// copy rest of elements of left array in the sorted merged array
		while (i < leftsize) {
			arr[k] = leftarray[i];
			i++;
			k++;
		}
		// copy rest of elements of right array in the sorted merged array
		while (j < rightsize) {
			arr[k] = rightarray[j];
			j++;
			k++;
		}
	}
}

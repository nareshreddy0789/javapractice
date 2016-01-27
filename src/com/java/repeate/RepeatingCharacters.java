package com.java.repeate;

	public class RepeatingCharacters{ 
			int temp, true_count;
			int[] ar = { 1, 2, 3, 4, 1 };
			public int count;

			public void find() {
			for (int i = 0; i < ar.length - 1; i++) {
			temp = ar[i];
			for (int j = i; j <= ar.length-1 ; j++) {

			if (temp == ar[j]) {

			count += 1;
			}

			}


			}
			}
}

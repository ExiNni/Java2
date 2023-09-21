package com.kh.example.pracitce1.model.vo;

import java.util.Random;

public class Lotto {

	int lotto[] = new int[6];

	public Lotto() {

		Random rand = new Random();

		for (int i = 0; i < lotto.length;) {
			int num = rand.nextInt(45) + 1;
			int j;
			for (j = 0; j < i; j++) {
				if (lotto[j] == num) {
					break;

				} else if (lotto[j] > num) {
					for (int k = i; k > j; k--) {
						lotto[k] = lotto[k - 1];
					}
					lotto[j] = num;
					break;
				}
			}

			if (j == i) {
				lotto[i] = num;
				i++;
			}
		}
	}

	public void information() {
		System.out.print("로또 번호: ");
		for (int number : lotto) {
			System.out.print(number + " ");
		}
	}
}

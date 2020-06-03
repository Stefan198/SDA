package ro.unitbv.javadatatype.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class problema3 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		int[] sir = new int[10];
		sir[0]=5;
		sir[1]=7;
		sir[2]=2;
		sir[3]=1;
		sir[4]=9;
		sir[5]=3;
		sir[6]=10;
		sir[7]=8;
		sir[8]=4;
		sir[9]=6;
		Arrays.sort(sir);
		boolean a = false;
		int b = 0;
		System.out.println(java.util.Arrays.toString(sir));
		System.out.println("Introdu numarul cautat :");
		int p = scanner.nextInt();
		
		CautareBinara(sir, p);

	}



	static boolean CautareBinara(int[] sir, int p) {
		boolean a = false;
		int sol = -1;
		int Left = 0, Right = sir.length - 1;
		while (Left <= Right) {
			int Mid = (Left + Right) / 2;
			if (sir[Mid] == p) {
				a = true;
				sol = Mid;
				break;
			}
			if (sir[Mid] > p)
				Right = Mid - 1;
			if (sir[Mid] < p)
				Left = Mid + 1;
		}
		System.out.println(a);
		if (a == true)
			System.out.printf("Pozitia in care se afla :%d", sol);
		return a;

	}

}

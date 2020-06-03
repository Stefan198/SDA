package ro.unitbv.javadatatype.lab4;


import java.util.Scanner;

public class problema2 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu pozitia :");
		int p = scanner.nextInt();
		int[] sir = new int[10];
	
		sir[0]=1;
		sir[1]=2;
		sir[2]=3;
		sir[3]=4;
		sir[4]=5;
		sir[5]=6;
		sir[6]=7;
		sir[7]=8;
		sir[8]=9;
		sir[9]=10;
		int n=sir.length-1;
		for(int i = p ; i <n; i ++)
		{
			sir[i]=sir[i+1];
			
		}
		sir[n]=0;
		System.out.println(java.util.Arrays.toString(sir));
		System.out.println(sir.length);
	}

}
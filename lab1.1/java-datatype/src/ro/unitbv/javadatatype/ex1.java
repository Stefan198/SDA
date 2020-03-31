package ro.unitbv.javadatatype;



import java.util.Scanner;



public class ex1 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Hello World");

		

		Scanner scanner=new Scanner(System.in);

		System.out.println("Introdu nr 1:");

		int nr1=scanner.nextInt();

		System.out.println("Introdu nr 2:");

		int nr2=scanner.nextInt();

		System.out.println("primul numarul citit este:"+nr1);

		System.out.println("al doilea nr citit este:"+nr2);

		System.out.println("suma numerelor="+(nr1+nr2));

		System.out.println("diferenta="+(nr1-nr2));

		System.out.println("produsul="+(nr1*nr2));

		System.out.println("media="+((nr1+nr2)/2));

		System.out.println("distanta dintre 2 int="+(nr2-nr1));

		System.out.println("impartire="+(nr1/nr2));

		

		

		

	



}	}
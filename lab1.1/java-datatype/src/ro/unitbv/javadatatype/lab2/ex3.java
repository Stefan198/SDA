package ro.unitbv.javadatatype.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Integer> myCoords = new ArrayList<Integer>();
		int drum2=scanner.nextInt();
		int drum3=scanner.nextInt();
	
		//String drum5=scanner.nextLine();
		//String drum6=scanner.nextLine();
		//String drum7=scanner.nextLine();
		//String drum8=scanner.nextLine();
		//String drum9=scanner.nextLine();
	    myCoords.add(drum2);
	    myCoords.add(drum3);
	    
	    System.out.println(myCoords);
	  }

	}



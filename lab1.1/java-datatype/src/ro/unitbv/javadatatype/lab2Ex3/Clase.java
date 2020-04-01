package ro.unitbv.javadatatype.lab2Ex3;



public class Clase {



	public static void main(String[] args)



	{

		Adresa adressM=new Adresa("Strada Mijloc","brasov",167);
		PaymentMethod pm1 = new PaymentMethod("Cash");

		Customer customer = new Customer("Mihai", "George", 35,adressM,pm1);

		Adresa adress = new Adresa("Malu Rosu", "Ploiesti", 112);

		PaymentMethod pm = new PaymentMethod("Card");

		System.out.println(customer);

		

		Customer customer1 = new Customer("Stefan", "Biclineru", 21, adress, pm);

		System.out.println(customer1);



		System.out.println(customer1.getPaymentMethod().gettype());

		System.out.println(customer1.getCompleteName());

		System.out.println(customer1.getAdress().getnumber());

		System.out.println(customer1.getAdress().getFullAdress());

		System.out.println(customer1.getAdress().getcity());

               System.out.println(customer1.getAdress());

	}



}
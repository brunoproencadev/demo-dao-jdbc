package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob Brown", "bob@gmail.com", new Date(), 3000.0, department);
		
		System.out.println(department);
		System.out.println(seller);

	}

}

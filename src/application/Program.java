package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
	
Saller seller = new Saller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);	
        System.out.println(seller);
	}

}

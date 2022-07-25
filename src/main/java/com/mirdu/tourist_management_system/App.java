package com.mirdu.tourist_management_system;

import java.util.ArrayList;
import java.util.Scanner;

import com.mirdu.tourist_management_system.entity.Tourist;
import com.mirdu.tourist_management_system.service.TouristService;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);		
		char ch = 'Y';
		int id;
		String name, desig;
		double sal;
		Tourist e;
		ArrayList<Tourist> empList = new ArrayList<Tourist>();
		TouristService empservice = new TouristService(empList);
		
		while (ch == 'Y') {
			System.out.println("Tourist Management System");
			System.out.println("1. Add Tourist");
			System.out.println("2. View Tourist");
			System.out.println("3. Update Tourist");
			System.out.println("4. Delete Tourist");
			System.out.println("5. Package Increment");
						
			System.out.println("Enter your choice:");
			int option = ip.nextInt();
			
			switch (option) {
				case 1:
					System.out.println("Enter the details of an Tourist:");
					System.out.println("Enter the tourist ID:");
					id = ip.nextInt();
					System.out.println("Enter the tourist Name:");
					name = ip.next();
					System.out.println("Enter the tourist Designation:");
					desig = ip.next();
					System.out.println("Enter the tourist package");
					sal = ip.nextDouble();
					e = new Tourist(id, name, desig, sal);
					empservice.addTourist(e);
					break;
				case 2:
					empservice.viewTourist();
					break;
				case 3:
					System.out.println("Enter the details of an Tourist:");
					System.out.println("Enter the tourist ID:");
					id = ip.nextInt();
					System.out.println("Enter the tourist Name:");
					name = ip.next();
					System.out.println("Enter the tourist Designation:");
					desig = ip.next();
					System.out.println("Enter the tourist package");
					sal = ip.nextDouble();
					e = new Tourist(id, name, desig, sal);
					empservice.updateTourist(e);
					break;
				case 4:
					System.out.println("Enter the id of the Tourist need to deleted:");
					System.out.println("Enter the tourist ID:");
					id = ip.nextInt();
					empservice.deleteTourist(id);
					break;
				case 5:
					System.out.println("Enter the tourist id for increment:");
					id = ip.nextInt();
					System.out.println("Enter the percentage of increment:");
					int per = ip.nextInt();
					empservice.increment(id, per);
					break;
				default:
					System.out.println("Wrong Option");
					break;
			}
			System.out.println("Want to continue press Y...");
			ch = ip.next().charAt(0);
		}
	}
}

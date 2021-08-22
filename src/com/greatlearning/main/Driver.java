package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.BankingService;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankingService bankingService = new BankingService();

		Customer customer1= new Customer("password", 123456 , 1000);


		Scanner sc = new Scanner(System.in);
		String password;
		int bankAccountNo;

		System.out.println("Welcome to the login page");

		System.out.println();
		System.out.println("Enter your account number");
		bankAccountNo= sc.nextInt();
		System.out.println("Enter the password");
		password = sc.next();

		Customer loggedInCustomer = new Customer(password, bankAccountNo);

		if(validateCustomer(loggedInCustomer, customer1)) {

			int option=0;

			do {
				System.out.println();
				System.out.println("----------------");
				System.out.println("1. Deposit");
				System.out.println("2. withrawl");
				System.out.println("3. Transfer");
				System.out.println("0. LogOut");
				System.out.println("-------------------------");
				option = sc.nextInt();

				switch(option) {
				case 0:
					option = 0;
					bankingService.logOut();
					break;
				case 1: {
					bankingService.deposit(loggedInCustomer);

				}

				break;
				case 2: {
					bankingService.withrawl(loggedInCustomer);

				}
				break;
				case 3:{
					bankingService.transer(loggedInCustomer);
				}break;
				default:
					System.out.println("enter valid option");
				}

			}while(option!=0);

		}else {
			System.out.println("Please enter correct password");
		}sc.close();
	}

	private static boolean validateCustomer( Customer loggedInCustomer, Customer customer1) {

		return loggedInCustomer.getBankAccount()==customer1.getBankAccount() && loggedInCustomer.getPassword().equals(customer1.getPassword());
	}

}


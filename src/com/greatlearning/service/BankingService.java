package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Customer;

public class BankingService {

	Scanner sc = new Scanner(System.in);
	public BankingService() {
		// TODO Auto-generated constructor stub
	}

	public void logOut() {

		System.out.println("Thanks for banking with us");
	}

	public void deposit(Customer customer) {

		int amount;
		System.out.println("enter the deposit amount");
		amount = sc.nextInt();

		if(amount>0) {

			System.out.println("Amount Deposited Successfully");
			customer.setBalance(customer.getBalance()+amount);
			System.out.println("Updated account :"+customer.getBalance());

		}else System.out.println("Please provide Valid amount");
	}

	public void withrawl(Customer customer) {

		int amount;
		System.out.println("enter the withdrawl amount");
		amount = sc.nextInt();

		if(customer.getBalance() >= amount) {

			System.out.println("Amount withdrawn successfully");
			customer.setBalance(customer.getBalance()-amount);
			System.out.println("Updated account "+customer.getBalance());

		}else System.out.println("Please provide valid amount, insufficient balance. Current balance is : "+customer.getBalance());

	}

	public void transer(Customer customer) {
		// TODO Auto-generated method stub
		int amount;
		int otp;
		int otpGenerated;
		int bankAccountNo;
		int rembalance;
		System.out.println("Enter the otp");
		otpGenerated = OTPService.generateOTP();
		System.out.println(otpGenerated);
		otp = sc.nextInt();
		if (otp == otpGenerated) {
			System.out.println("OTP verification Successful !!!");
			System.out.println(" Enter the amount no to which you want to transfer");
			amount = sc.nextInt();
			System.out.println(" Enter the BankAccount no to which you want to transfer");
			bankAccountNo = sc.nextInt();

			if (customer.getBalance() - amount >= 0) {
				System.out.println("amount " + amount + " transferred successful to bankAccount: " + bankAccountNo);
				rembalance = customer.getBalance() - amount;
				customer.setBalance(rembalance);
				System.out.println("Remaining Bank balance is : " + customer.getBalance());
			} else
				System.out.println("insufficient funds");

		} else
			System.out.println("invalid otp please try again");

	}

}

